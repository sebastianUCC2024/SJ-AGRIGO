package users.model;

public class AgroStore extends Users {
    private AgroStore(Builder builder){
        super(builder);
    }

    public static class Builder extends Users.Builder<Builder>{
        public Builder(String email,String password,Role role){
            super(email, password, role);
        }
        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public AgroStore build(){
            return new AgroStore(this);
        }

    }




}
