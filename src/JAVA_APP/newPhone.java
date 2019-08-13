package JAVA_APP;

public class newPhone {
    public static void main(String args[]) {
        phoneShop ph = new phoneShop();
        phone p = ph.getPhone();
        p.calling();
        p.sms();
    }

}
