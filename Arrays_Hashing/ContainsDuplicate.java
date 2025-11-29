package Arrays_Hashing;

import java.util.HashMap;

public class ContainsDuplicate {
        public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>1){
                 return true;
            }
        }
                       return false;
    }
   public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4}; // ✅ use [] to declare array
        ContainsDuplicate obj = new ContainsDuplicate(); // ✅ need an instance
        boolean res = obj.hasDuplicate(nums); // ✅ call via instance
        System.out.println(res); // ✅ print the result instead of 'return'
    }
}
