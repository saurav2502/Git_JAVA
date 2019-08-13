package JAVA_APP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static JAVA_APP.String_demo_substr.findStringvalue;
import static JAVA_APP.String_demo_substr.plz_wait;

public class String_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "gsdhgflkahn hlhdfkfdsfkhjh \"jgdkfg saurav sauravall";
        String first = sc.next();
        System.out.println(plz_wait);

        String second = sc.next();
        /*String_demo_substr str = new String_demo_substr();*/
        /* str*/
        findStringvalue(first, second, name);
        System.out.println("hello");
        System.out.println("Saurav");
        /*
        String end = sc.next();



        String actualStr = start.concat(end);
        Pattern pat = Pattern.compile(actualStr);
        Matcher match = pat.matcher(name);
        if (match != null){
            if (match.find()){
                System.out.println("Found value: " + match.group(0) );
            }
            else
                System.out.println("not found");
        }*/
    }
}
