package concurrency.demo2;

public class HelloRunnable implements Runnable {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new HelloRunnable()).start();
        }
        System.out.println("Hello from main thread");
    }

    @Override
    public void run() {
        System.out.println("Hello thread " + Thread.currentThread().getName());
    }
}
