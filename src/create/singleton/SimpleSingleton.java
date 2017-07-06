package create.singleton;

/**
 * Created by Sun on 4/2/2017.
 */

public final class SimpleSingleton {

    private static SimpleSingleton instance;

    // Private constructor prevents instantiation from other classes
    private SimpleSingleton() {
    }

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
