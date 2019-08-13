package JAVA_APP.Threads;

public class NewdemoThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi i'm 1st Thread 0" +" "+i);
        }

    }
}

class HelloThread{
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread d = new TharedDemo(printer);
        d.start();
        /*try {
            d.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread d1 = new YourThread(printer);
        d1.start();

    }

}


/*class TharedDemo implements Runnable{
    Printer p;
    TharedDemo(Printer pref){
        p = pref;
    }
    @Override
    public void run() {
        p.printDoc(10);
    }
}*/
class YourThread extends Thread{
    Printer p;
    YourThread(Printer pref){
        p = pref;
    }
    @Override
    public void run() {
        synchronized (p){
            p.printDoc(10, "power.pdf");
        }
        /*p.printDoc(10, "power.pdf");*/
    }
}

class TharedDemo extends Thread{
    Printer p;
    TharedDemo(Printer pref){
        p = pref;
    }
    @Override
    public void run() {
        synchronized (p){
            p.printDoc(10, "doc.pdf");
        }
        /*p.printDoc(10, "doc.pdf");*/
    }
}

class Printer{
   /*synchronized void printDoc(int num, String docName){*/
       void printDoc(int num, String docName){
       for (int i = 0; i <num ; i++) {
           System.out.println("printer "+i+docName);
       }
   }
}