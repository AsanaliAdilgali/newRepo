package newTest;

import java.util.HashMap;
import java.util.Map;

public class Decision {
    public int[] twoNum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            int addition = target - nums[i];

            if (map.containsKey(addition)){
                result[0] = map.get(addition);
                result[1] = i;
                return result;
            }
            map.put(nums[ i ], i);
        }

        return result;
    }
}