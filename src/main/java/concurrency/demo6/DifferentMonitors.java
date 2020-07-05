package concurrency.demo6;

public class DifferentMonitors {
    private static long c1 = 0;
    private static long c2 = 0;
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(DifferentMonitors::inc1).start();
            new Thread(DifferentMonitors::dec1).start();
        }
        Thread.sleep(3000L);
        System.out.println("Total c1: " + c1);
//        System.out.println("Total c2: " + c2);
    }

    public static void inc1() {
        synchronized(lock1) {
        System.out.println(Thread.currentThread().getName() + " inc before: " + c1++);
//        c1++;
        System.out.println(Thread.currentThread().getName() + " inc after: " + c1);
        System.out.println();
        }
    }

    public static void dec1() {
//        synchronized(lock2) {
            System.out.println(Thread.currentThread().getName() + " dec before: " + c1--);
//            c1--;
            System.out.println(Thread.currentThread().getName() + " dec after: " + c1);
            System.out.println();
//        }
    }

    public static void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
}
