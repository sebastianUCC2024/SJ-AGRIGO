package users.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnore;
import profiles.model.Profile;


@Document(collection = "users")
public abstract class Users {
    @Id
    private String id;
    private String email;
    @JsonIgnore
    private String password;
    private Role role;
    private Profile profile;

    protected Users() {}

    protected Users(Builder<?> builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
        this.profile = builder.profile;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Profile getProfile() {
        return profile;
    }

    public static abstract class Builder<T extends Builder<T>> {
        protected String id;
        protected String email;
        protected String password;
        protected Role role;
        protected Profile profile;

        public Builder(String email, String password, Role role) {
            this.email = email;
            this.password = password;
            this.role = role;
        }

        protected Builder() {
        }

        protected abstract T self();

        public abstract Users build();

        public T id(String id) {
            this.id = id;
            return self();
        }

        public T profile(Profile profile) {
            this.profile = profile;
            return self();
        }


    }
}
