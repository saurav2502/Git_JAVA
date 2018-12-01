package JAVA_APP;

public class String_demo_substr {
    public static final String plz_wait="Please wait";
    public static void findStringvalue (String s1, String s2,String name){
       int index1 = name.indexOf(s1,0);
       int index2 = name.indexOf(s2,index1);
        System.out.println(name.substring(index1,index2));
    }
}
