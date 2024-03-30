// import java.util.HashMap;

// public class MaximumSumSubarray {
//     public static void main(String[] args) {
//         int[] nums={5,3,3,1,1};
//         int k = 3;
//         System.out.println(Maximum(nums, k));
//     }
//     public static long Maximum(int[] nums, int k) {
//         long ans = 0;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         long WindowSum = 0;
//         int start = 0;
//         int end = 0;
//         while(end < nums.length){
//             WindowSum+=nums[end];
//             map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
//             if(map.get(nums[end]) > 1){
//                 WindowSum-=(nums[start]  );
//                 map.put(nums[end], map.getOrDefault(nums[end], 0) - 1);
//                 if(map.get(nums[end]) == 0){
//                     map.remove(nums[start]);
//                 }
//                 start++;
//             }
//             if(map.size() == k){
//                 if (map.get(nums[end]) <= 1 ) {
//                     ans = Math.max(ans, WindowSum);
//                 }
//                 WindowSum= WindowSum - (nums[start] * map.get(nums[start]));
//                 map.remove(nums[start]);
//                 start++;
//             }
//             end++;
//         } 
//         return ans;
// }
// }

import java.util.HashMap;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,7,8,9};
        int k = 3;
        System.out.println(Maximum(nums, k));
    }

    public static long Maximum(int[] nums, int k) {
        long ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        long windowSum = 0;
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            windowSum += nums[end];
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while (map.size() > k || map.get(nums[end]) > 1) {
                windowSum -= nums[start];
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }

            if (map.size() == k) {
                ans = Math.max(ans, windowSum);
            }

            end++;
        }

        return ans;
    }
}
