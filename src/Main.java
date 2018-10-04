import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        LocationTester me = new LocationTester(33.4, 120.9);
        LocationTester anotherme = new LocationTester();
        LocationTester goldtreasure = new LocationTester(80.5, 34.9);

        System.out.println("this is me " + me.latitude + " that is another me " + anotherme.latitude + " and that is the goldtreasure " + goldtreasure.latitude + " latitude");
        me.latitude += 50.0;
        System.out.println("this is the new me " + me.latitude);
        me.setSecret(20.0);
        System.out.println("my secret " + me.getSecret());
    }
}
