package users.model;

public class Customer extends Users{
    private Customer(Builder builder){
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
        public Customer build(){
            return new Customer(this);
        }

    }




}
