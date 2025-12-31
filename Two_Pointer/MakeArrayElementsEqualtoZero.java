class Solution {
    public static boolean check(int[] nums,int nonZeroCount,int i,int dir){
         int curr = i;
       int[] temp = Arrays.copyOf(nums, nums.length);
         //until, i cross boundar for left it cant cross 0
         while(curr>=0 && nonZeroCount>0 && curr<nums.length){
        if(temp[curr]>0){
            temp[curr]= temp[curr]-1;
            //need to change the direction 
            //for left side 
            dir=dir*-1;
            if(  temp[curr]==0){
                //ovious, nonZeroCount will be decrease
                nonZeroCount--;
            }
        }
        //direction wil play like a ping -pong..once left once right
        curr=curr+dir;
    }
    return (nonZeroCount==0); //al must be zero
    }
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int totalOperations = 0;
        // int curr = 0;
        int nonZeroCount = 0;
        //range should be o to n-1
        int dir=1; 
     for(int i=0;i<n;i++){
        if(nums[i]!=0){
            nonZeroCount++;
        }
     }
     //the problem is just like, ping-pong ball
     for(int i=0;i<n;i++){
        if(nums[i]==0){
 //i can start frm here as the qu. says->If nums[curr] == 0, move in the current direction by incrementing curr if you are moving right, or decrementing curr if you are moving left.
 //now i hae to make left - checking and right checking UNTIL Elements==0 i.e,  nonZeroCount ==0
 if(check(nums,nonZeroCount,i,-1)){
   totalOperations++;
 }
 if(check(nums,nonZeroCount,i,1)){
 totalOperations++;
 }
        }
     }
        return totalOperations;
    }
}