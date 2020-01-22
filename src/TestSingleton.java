public class TestSingleton {
    public static void main(String[] args) {
        // use getInstance() multiple times
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // change testString of one of the Singletons
        s1.testString =  (s1.testString).toUpperCase();

        // all of the Singletons are affected, because they reference to the same object
        System.out.println("String from s1 is " + s1.testString);
        System.out.println("String from s2 is " + s2.testString);
        System.out.println("String from s3 is " + s3.testString);
        System.out.println("\n");

        // change testString of one of the Singletons
        s3.testString = (s3.testString).toLowerCase();

        // all of the Singletons are affected, because they reference to the same object
        System.out.println("String from s1 is " + s1.testString);
        System.out.println("String from s2 is " + s2.testString);
        System.out.println("String from s3 is " + s3.testString);
    }
}
