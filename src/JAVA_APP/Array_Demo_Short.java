package JAVA_APP;

import java.util.HashMap;
import java.util.Map;

public class Array_Demo_Short {
    public static int countmaxpro(int[] arr){
        int lenght = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for (int x:arr){
            int i =0;
            hm.put(x,i++);
        }
        int max_frequency = 0;
        int result[] = new int[hm.size()];
        for (Map.Entry entry: hm.entrySet()){
            result[max_frequency++] = Math.max((int)entry.getKey(),max_frequency);
        }
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }
        return result.length;
    }
}
