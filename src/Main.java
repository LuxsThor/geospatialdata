
public class Main {

    public static void main(String[] args) {
        LocationTester me = new LocationTester(33.4, 120.9);
        LocationTester goldtreasure = new LocationTester(80.5, 34.9);

        System.out.println("Distance from me to treasure"+ me.distance(goldtreasure));
    }
}
