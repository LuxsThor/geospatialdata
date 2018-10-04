public class LocationTester {
    public double longitude;
    public double latitude;

    public LocationTester(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public double distance(LocationTester other) {
        return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
    }
}
