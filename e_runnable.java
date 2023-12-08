class meroThread implements Runnable {
    public void run() {
        System.out.println("Mero thread is running");
    }
}

public class e_runnable {
    public static void main(String[] args) {
        meroThread mt = new meroThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
