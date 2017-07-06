package create.builder;

/**
 * Created by Sun on 4/2/2017.
 */

public class Person {

    private String mName;
    private int mAge;
    private String mAddress;

    public Person(Builder builder) {
        mName = builder.mName;
        mAge = builder.mAge;
        mAddress = builder.mAddress;
    }

    @Override
    public String toString() {
        return "mName: " + mName + ",mAge: " + mAge + ",mAddress " + mAddress;
    }

    /**
     * Builder class
     */
    public static class Builder {
        private String mName;
        private int mAge;
        private String mAddress;

        public Builder() {
        }

        public Builder widthName(String name) {
            this.mName = name;
            return this;
        }

        public Builder widthAge(int age) {
            this.mAge = age;
            return this;
        }

        public Builder widthAddress(String address) {
            this.mAddress = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
