package JAVA_APP;

public class Machine implements Info {
    private int id;

    public Machine(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Machine is started: " + id);
    }
}
