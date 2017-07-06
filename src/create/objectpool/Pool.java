package create.objectpool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sun on 4/2/2017.
 */

/**
 * Generic object pool
 * @param <T> Type T of Object in the Pool
 */
public abstract class Pool<T> {

    private Set<T> available = new HashSet<>();
    private Set<T> inUse = new HashSet<>();

    protected abstract T create();

    /**
     * Checkout object from pool
     */
    public synchronized T checkOut() {
        if (available.size() <= 0) {
            available.add(create());
        }
        T instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}
