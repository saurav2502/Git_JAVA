package JAVA_APP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "geek");
        map.put(2, "geeksfor");
        map.put(3, "geeksfr=orgeek");
        map.put(4, "geeksforgeeks");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        String input = sc.next();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (input.equals(entry.getValue())) {
                iterator.remove();

            }
            System.out.println(map);

        }
    }
}
