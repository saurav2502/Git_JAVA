package parent_child;

public class Parent {
    public int add(int i, int j) throws Exception {
        return i + j;
    }

}
class Child extends Parent{

    @Override
    public int add(int i, int j) throws Exception {
        return super.add(i, j);
    }
}

class Runner{

    public static void main(String[] args)  {
        Child ch = new Child();
        try {
            System.out.println(ch.add(10,20));
        }catch (Exception ee){
            System.out.println(ee.getMessage());
        }

    }
}
