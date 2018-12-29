package JAVA_APP;

public class App {
    public static void main(String[] args) {
        Machine info1 = new Machine(7);
        info1.showInfo();


        Person info2 = new Person("saurav");
        info2.showInfo();

        displayInfo(info1);
        displayInfo(info2);


        Info info = new Machine(8);
        info.showInfo();
        Info info3 = new Person("amit");
        info3.showInfo();
    }

    public static void displayInfo(Info info){
        info.showInfo();
    }
}
