package JAVA_APP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strdate = simpleDateFormat.format(date);
        System.out.println(strdate);
        simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strdate = simpleDateFormat.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strdate);

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        strdate = simpleDateFormat.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strdate);

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strdate = simpleDateFormat.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strdate);

        simpleDateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strdate = simpleDateFormat.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strdate);
    }
}
