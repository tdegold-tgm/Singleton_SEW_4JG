public class Singleton {

    private static Singleton instance;

    public String testString = "this test is used to test the singleton design pattern";

    private Singleton(){}

    public static Singleton getInstance(){
        if(Singleton.instance == null){
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}
