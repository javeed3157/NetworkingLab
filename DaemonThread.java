public class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    // 39110926-SHAIK JAVEED SUHAIL
    public void run() {
        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
        // starting first 2 threads
        t1.start();
        t2.start();
        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}

// DaemonThread with exception
// public class DaemonThread extends Thread {
// public void run() {
// System.out.println("Thread name: " + Thread.currentThread().getName());
// System.out.println("Check if its DaemonThread: " +
// Thread.currentThread().isDaemon());
// }
// //39110926-SHAIK JAVEED SUHAIL
// public static void main(String[] args) {
// DaemonThread t1 = new DaemonThread();
// DaemonThread t2 = new DaemonThread();
// t1.start();
// // Exception as the thread is already started
// t1.setDaemon(true);
// t2.start();
// }
// }
