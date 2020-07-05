package concurrency;

public class TestConcurrency1 {

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new HelloThread().start();
//        }
//        System.out.println("Hello from main thread");
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(new HelloRunnable()).start();
//        }
//        System.out.println("Hello from main thread");
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println("Hello thread "
                    + Thread.currentThread().getName())).start();
        }
        System.out.println("Hello from main thread");
    }

    private static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + getName());
        }
    }

    private static class HelloRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello thread " + Thread.currentThread().getName());
        }
    }

    private synchronized void doSomethingNonStatic1() {}

    private synchronized void doSomethingNonStatic2() {
        synchronized(this) {        }
    }

    private static void get2() {
        synchronized(TestConcurrency1.class) {        }
    }
}
