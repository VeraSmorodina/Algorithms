package task5;

import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public static int massdriver(int[] activate) {
        int index = activate.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < activate.length; i++) {
            if (!map.containsKey(activate[i])) {
                map.put(activate[i], i);
                continue;
            }
            if (map.get(activate[i]) < index)
                index = map.get(activate[i]);
        }
        return index == activate.length ? -1 : index;
    }
}