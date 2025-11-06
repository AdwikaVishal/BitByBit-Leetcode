class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length/2;
        HashMap<Integer,Integer> hash = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hash.get(nums[i]) != null){
                count = hash.get(nums[i]);
                hash.put(nums[i],count+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
    if (entry.getValue() > n) {
        return entry.getKey();
    }
}
    return 0;}
}
