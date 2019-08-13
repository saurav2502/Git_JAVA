package JAVA_APP.Threads;

public class StringDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show() {
        super.show();

        System.out.println("Child's show()");
    }
}
