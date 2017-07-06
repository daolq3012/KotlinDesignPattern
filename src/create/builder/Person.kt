package create.builder

/**
 * Created by Sun on 4/2/2017.
 */

class Person(builder: Person.Builder) {

    private val mName: String?
    private val mAge: Int?
    private val mAddress: String?

    init {
        mName = builder.mName
        mAge = builder.mAge
        mAddress = builder.mAddress
    }

    override fun toString(): String {
        return "mName: $mName,mAge: $mAge,mAddress $mAddress"
    }

    /**
     * Builder class
     */
    class Builder {
        var mName: String? = null
        var mAge: Int = 0
        var mAddress: String? = null

        fun widthName(name: String): Builder {
            this.mName = name
            return this
        }

        fun widthAge(age: Int): Builder {
            this.mAge = age
            return this
        }

        fun widthAddress(address: String): Builder {
            this.mAddress = address
            return this
        }

        fun build(): Person {
            return Person(this)
        }
    }
}
