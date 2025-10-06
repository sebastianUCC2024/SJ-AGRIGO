package profiles.model;

public abstract class Profile {
    private long id;
    private String lastName;
    private String phone;
    private Location location;

    protected Profile() {

    }

    protected Profile(Builder<?> builder) {
        this.id = builder.id;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.location = builder.location;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public Location getLocation() {
        return location;
    }

    public static abstract class Builder<T extends Builder<T>> {
        protected long id;
        protected String lastName;
        protected String phone;
        protected Location location;

        protected abstract T self();
        public abstract Profile build();

        public T id(long id) {
            this.id = id;
            return self();
        }

        public T lastName(String lastName) {
            this.lastName = lastName;
            return self();
        }

        public T phone(String phone) {
            this.phone = phone;
            return self();
        }

        public T location(Location location) {
            this.location = location;
            return self();
        }
    }
}
