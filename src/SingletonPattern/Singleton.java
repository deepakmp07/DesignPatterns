package SingletonPattern;

public class Singleton {

    private static Singleton instance;

    int a = 10;
    private Singleton() {}

    public static Singleton getInstance(){
        if(instance==null) {
            return instance = new Singleton();
        }
        else{
            return instance;
        }
    }
}
