package concurrency.demo10;

import java.util.Random;

public class ThreadLocalExample implements Runnable {
    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final Integer formatter1 = 5;
    private int userId;
//    private static final ThreadLocal<Object> formatter2 = ThreadLocal.withInitial(() -> 1);

    ThreadLocalExample(int userId) {
        this.userId = userId;
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample(8);
        for(int i=0 ; i<2; i++){
            Thread t = new Thread(obj, ""+i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        User user = userService.getUser(userId);
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter1);
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //formatter pattern is changed here by thread, but it won't reflect to other threads
//        formatter1.set(new Object());
//        System.out.println("Thread Name= "+Thread.currentThread().getName()+" new formatter = "+formatter1.get());
//        formatter1.set(new Object());
//        System.out.println("Thread Name= "+Thread.currentThread().getName()+" new formatter = "+formatter1.get());
    }
}
