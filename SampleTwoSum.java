import java.util.ArrayList;
import java.util.HashMap;

public class SampleTwoSum {
    public static void main(String[] args) {
        int[] result1 = calculTowSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println((result1 != null && result1[0] == 0 && result1[1] == 1) ? "Test 1 réussi" : "Test 1 raté");

        int[] result2 = calculTowSum(new int[]{15, 12, 9, 1, 5, 3}, 8);
        System.out.println((result2 != null && result2[0] == 4 && result2[1] == 5) ? "Test 2 réussi" : "Test 2 raté");

        int[] result3 = calculTowSum(new int[]{10, 6, 8, 11, 2}, 10);
        System.out.println((result3 != null && result3[0] == 2 && result3[1] == 4) ? "Test 3 réussi" : "Test 3 raté");
    }

//    static int[] calculTowSum(int[] nums, int target) {
//        int[] indices = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int o = i + 1; o < nums.length; o++) {
//                if (nums[i] + nums[o] == target) {
//                    indices[0] = i;
//                    indices[1] = o;
//                    return indices;
//                }
//            }
//        }
//
//        return new int[0];
//    }

    public static int[] calculTowSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indices.containsKey(complement)) {
                return new int[] { indices.get(complement), i };
            }
            indices.put(nums[i], i);
            System.out.println(indices);
        }


        return new int[] {};
    }
}