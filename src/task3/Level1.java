package task3;

import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public static boolean EEC_help(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.containsKey(arr1[i]) ? map1.get(arr1[i]) + 1 : 1);
            map2.put(arr2[i], map2.containsKey(arr2[i]) ? map2.get(arr2[i]) + 1 : 1);
        }
        return map1.equals(map2);
    }
}