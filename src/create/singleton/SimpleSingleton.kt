package create.singleton

/**
 * Created by Sun on 4/2/2017.
 */

object SimpleSingleton {

    private var instance: SimpleSingleton? = null

    @Synchronized fun getInstance(): SimpleSingleton? {
        if (instance == null) {
            instance = SimpleSingleton
        }
        return instance
    }
}
