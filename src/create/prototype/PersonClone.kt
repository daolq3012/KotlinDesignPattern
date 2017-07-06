package create.prototype

/**
 * Created by Sun on 4/2/2017.
 */

class PersonClone(val name: String) : Cloneable {

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): PersonClone {
        return super.clone() as PersonClone
    }
}
