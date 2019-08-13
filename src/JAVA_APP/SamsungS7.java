package JAVA_APP;

public class SamsungS7 implements phone {
    @Override
    public void calling() {
        System.out.println("calling");
    }

    @Override
    public void sms() {
        System.out.println("messaging!");

    }
}
