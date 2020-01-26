package program;

import java.util.Scanner;

public class FindSubsString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findExistingSubstring(sc.next(),sc.next()));
    }

    private static int findExistingSubstring(String originalStr, String str) {
        int count = originalStr.split(str,-1).length-1;
        String[] str_1 = originalStr.split(str,-1);
        return count;
    }

}
