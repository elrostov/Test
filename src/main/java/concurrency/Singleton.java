package concurrency;

public class Singleton {

    private int foo;
    private String bar;

    private Singleton() {
        foo = 13;
        bar = "zap";
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}
