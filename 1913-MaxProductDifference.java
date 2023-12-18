class Solution {
    public int maxProductDifference(int[] nums) {
        int max,max2,min,min2;
        Arrays.sort(nums);
        max=nums[nums.length-1];
        max2=nums[nums.length-2];
        min=nums[0];
        min2=nums[1];

        return (max*max2)-(min*min2);
    }
}
