import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //O(n^2)  hehe......
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return null;
    }
    //using hashmap O(n)
    public static int[] twoSum2(int[] nums, int target){
        int[] result = new int[2];
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i=0; i< nums.length; i++){
            if (map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                if (result[0]!=result[1]) {
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // write your code here
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum2(nums,target);
        if (result.length!=0){
            System.out.println("["+result[0]+","+result[1]+"]");
        }

    }
}
