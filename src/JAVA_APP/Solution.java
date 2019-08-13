package JAVA_APP;

import java.io.*;
import java.util.*;


public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> sets = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if (!sets.contains(ar[i])) {
                sets.add(ar[i]);
            } else {
                pairs++;
                sets.clear();
            }
        }

        System.out.println(pairs);
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }
}

