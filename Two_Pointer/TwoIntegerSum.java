package Two_Pointer;

public class TwoIntegerSum {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int res[];
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
              //insert into res && return
              return new int[]{left+1,right+1};
   
               
            }else if(numbers[left]+numbers[right]>target){
                 //move right backward
                right--;
            }else{
            //move l forward
            left++;
            }

        }
        //if no element then -1,-1
        return new int[]{-1,-1};
    }
}
