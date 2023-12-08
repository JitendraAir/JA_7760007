class myThread extends Thread {
    public void run() {
        System.out.println("My thread is running");
    }
}

public class d_thread {
    public static void main(String[] args) {
        myThread mt = new myThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
