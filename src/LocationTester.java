public class LocationTester {
    public double longitude;
    public double latitude;
    private double secretmagic;

    public LocationTester() {
        this.longitude = 50.0;
        this.latitude = 50.0;
    }
    // overloading the constructor
    public LocationTester(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public void setSecret(double secret){
        this.secretmagic = secret;
    }

    public double getSecret() {
        return this.secretmagic;
    }
//    public double distance(LocationTester other) {
//        return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
//    }
}
