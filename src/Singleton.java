public class Singleton {

    private static Singleton instance;

    public String testString = "this test is used to test the singleton design pattern";

    private Singleton(){}                           // private Constructor

    public static Singleton getInstance(){          // getInstance() always returns the same object
        if(Singleton.instance == null){
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}
