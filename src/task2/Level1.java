package task2;

import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public static String digitalRain(String col) {
        int count = 0;
        int maxLength = 0;
        int endIndex = -1;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < col.length(); i++) {
            count = col.charAt(i) == '0' ? count - 1 : count + 1;
            if (!countMap.containsKey(count)) {
                countMap.put(count, i);
                continue;
            }
            int prevIndex = countMap.get(count);
            int currentLength = i - prevIndex;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                endIndex = i;
            }
        }
        return endIndex == -1? "" : col.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}