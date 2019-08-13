package JAVA_APP;

public class Singleton {
    //private static variavle
    private static Singleton name = null;
    //String variable
    public String s;

    //private contructor
    private Singleton() {
        s = "hi there!, i doing nothind!!!";
    }

    //instantiation of singleton class
    public static Singleton getInstance() {
        if (name == null) {
            name = new Singleton();
        }
        return name;
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.s.toUpperCase());
    }
}
