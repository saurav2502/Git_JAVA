package JAVA_APP.Threads;

public class MyThread extends Thread {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("@@ my thread is running at port:8080 #" + i);
        }

    }


}

class NewThread extends MyThread implements Runnable {
    @Override
    public void run() {
        super.run();
    }
}

class Default {
    public static void main(String[] args) {
        Runnable r = new NewdemoThread();
        Thread thread = new Thread(r);
        //thread.run();
        //MyThread task = new MyThread();

        System.out.println("## Application Started ##");
        r.run();

        for (int i = 0; i < 10; i++) {
            System.out.println("** new thread started **" + i);
        }

    }
}



