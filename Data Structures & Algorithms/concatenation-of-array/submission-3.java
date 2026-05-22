class Solution {
    public int[] getConcatenation(int[] nums) {
        //int size = nums.length;
        int[] ans = new int[2*nums.length];
        for(int i = 0; i<nums.length*2; i++){
            ans[i]=nums[i%nums.length];
            //ans[i+size]=nums[i];
        }
        return ans;
    }
}