package JAVA_APP;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Steps {

    static int getSteps(int n, String s) {
        int[] levels = new int[n];
        int up = 0, down = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                up++;
            } else {
                down++;
            }
            levels[i] = up - down;

        }
        for (int i = 0; i < n; i++) {
            if (levels[i] < 0) {
                for (int ii = i; ii < n; ii++) {
                    if (levels[ii] == 0) {
                        count++;
                        i = ii;
                        break;
                    }
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        String step = scanner.next();
        int result = getSteps(n, step);
        System.out.println(result);
        scanner.close();
    }
}
