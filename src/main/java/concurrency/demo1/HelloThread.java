package concurrency.demo1;

public class HelloThread extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new HelloThread().start();
        }
        System.out.println("Hello from main thread");
    }

    @Override
    public void run() {
        Object obj = new Object();
        System.out.println("Hello from " + getName() + " obj: " + obj);
    }
}
