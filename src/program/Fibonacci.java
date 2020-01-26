package program;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    /***
     * @Author saurav
     * @param nextInt
     * @return sum of fibonacci series with input nextInt
     */
    public int findFibonacci(int nextInt) {
        if (nextInt < 1){
            return 1;
        }else {
            return findFibonacci(nextInt-1) + findFibonacci(nextInt-2 );
        }
    }

    public boolean findAnagram(String str1, String str2) {
        boolean isAnagram = true;
        if (str1.length() != str2.length()){
             return isAnagram = false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            for (int j = i; j <= i; j++) {
                if (chars1[i] != chars2[j]){
                    return isAnagram = false;
                }else {
                    isAnagram = true;
                }
            }
        }
        return isAnagram;
    }
}

class Runner{

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        /*int n = fib.findFibonacci(scanner.nextInt());
        System.out.println(n);*/
        System.out.println(fib.findAnagram(scanner.next(), scanner.next()));
    }
}
