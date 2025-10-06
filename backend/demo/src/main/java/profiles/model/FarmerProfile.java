package profiles.model;

public class FarmerProfile extends Profile {
    private String typeCrop;
    private double amountOfLand;

    protected FarmerProfile(Builder builder) {
        super(builder);
        this.typeCrop = builder.typeCrop;
        this.amountOfLand = builder.amountOfLand;
    }

    public String getTypeCrop() {
        return typeCrop;
    }

    public double getAmountOfLand() {
        return amountOfLand;
    }

    public static class Builder extends Profile.Builder<Builder> {
        private String typeCrop;
        private double amountOfLand;

        public Builder() {}

        public Builder typeCrop(String typeCrop) {
            this.typeCrop = typeCrop;
            return this;
        }

        public Builder amountOfLand(double amountOfLand) {
            this.amountOfLand = amountOfLand;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public FarmerProfile build() {
            return new FarmerProfile(this);
        }
    }
}
