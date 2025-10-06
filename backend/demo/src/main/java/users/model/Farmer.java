package users.model;

public class Farmer extends Users{

    private Farmer(Builder builder){
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
        public Farmer build(){
            return new Farmer(this);
        }

    }



}
