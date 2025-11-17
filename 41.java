class Solution {

    HashSet<Integer> set;

    public int firstMissingPositive(int[] nums) {

        set = new HashSet<>();
        for (int num : nums) set.add(num);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) smallest = nums[i];
            if (nums[i] > largest) largest = nums[i];
        }

        if (largest < 1) return 1;

        for (int candidate = 1; candidate <= nums.length; candidate++) {
            if (!containsNumber(nums, candidate)) {
                return candidate;
            }
        }

        return nums.length + 1;
    }

    public boolean containsNumber(int[] nums, int target) {
        return set.contains(target);   
    }
}
