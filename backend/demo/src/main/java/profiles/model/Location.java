package profiles.model;

public class Location {
    private String address;
    private double latitude;
    private double legth;

    public Location(String address,double latitude,double legth) {
        this.address = address;
        this.latitude = latitude;
        this.legth = legth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLegth() {
        return legth;
    }

    public void setLegth(double legth) {
        this.legth = legth;
    }
}
