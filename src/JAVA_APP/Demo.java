package JAVA_APP;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.*;
import static java.util.stream.Collectors.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set set = new HashSet();
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            name[i] = sc.next();
        }
        Map maplist = new HashMap();
        List keyList = Arrays.asList(arr);
        List valueList = Arrays.asList(name);
        maplist.put(keyList, valueList);
        Iterator iterator = maplist.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry key = (Map.Entry) iterator.next();
            System.out.println(key.getKey().toString() + " " + key.getValue());
        }


    }
}
