package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        System.out.println(s1.a);
    }
}
