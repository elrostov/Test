package concurrency.demo5;

public class AccessWhileBlocked {

    private static int i = 10;

    public static synchronized void incrementIJ() {
        System.out.println("i from " + Thread.currentThread().getName() + " before: " + i);
        for(int k = 0; k < 2_000_000_000; k++) {
            i++;
        }
        System.out.println("i from " + Thread.currentThread().getName() + " after: " + i);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(AccessWhileBlocked::incrementIJ);
        Thread t2 = new Thread(() -> {
            System.out.println("i from " + Thread.currentThread().getName() + " before: " + i);
            for(int k = 0; k < 1_000_000_000; k++) {
//                syncDecI();
                decI();
//                i--;
            }
            System.out.println("i from " + Thread.currentThread().getName() + " after: " + i);
        });
        t1.start();
        t2.start();
    }

    private static synchronized void syncDecI() {
        i--;
    }

    private static void decI() {
        i--;
    }

    public static int getI() {
        return i;
    }
}
