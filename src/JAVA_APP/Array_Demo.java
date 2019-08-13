package JAVA_APP;

import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();// Array element is inserted of length 'n'
        }
        Array_Demo_Short demoShort = new Array_Demo_Short();
        System.out.println(demoShort.countmaxpro(arr));
    }
}
