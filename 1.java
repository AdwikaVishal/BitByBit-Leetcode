import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int[] numbers = new int[2]; 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
            numbers[0] = i;
            numbers[1] = j;
            return numbers;
                }
            }
        }
        return numbers;
}
}
