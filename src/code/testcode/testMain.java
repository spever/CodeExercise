package code.testcode;

/**
 * @author Spever
 * @date 2020/6/17
 */
public class testMain {
    private int count;

    public static void main(String[] args) {
//        SyncThread syncThread1 = new SyncThread();
//        SyncThread syncThread2 = new SyncThread();
//        Thread thread1 = new Thread(syncThread1, "SyncThread1");
//        Thread thread2 = new Thread(syncThread2, "SyncThread2");
//        thread1.start();
//        thread2.start();

        new Outer().doAction();
    }


}
