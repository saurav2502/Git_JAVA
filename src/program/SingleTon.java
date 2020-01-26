package program;

public class SingleTon {

    private static SingleTon singleTon = new SingleTon();
    public String s;

    public SingleTon() {
        s = "This is singlton class!";
    }

    public static SingleTon getInstance(){
        return singleTon;
    }



}

class SingletonRunner{

    public static void main(String[] args) {
        SingleTon singleTon_x = new SingleTon();
        SingleTon singleTon_y = new SingleTon();
        SingleTon singleTon_z = new SingleTon();
        System.out.println(singleTon_x.s);
        System.out.println(singleTon_y.s);
        System.out.println(singleTon_z.s);

    }
}
