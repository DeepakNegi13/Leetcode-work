class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag = false;
        int n = nums.length;
        int[] outputarr = new int[2];
        for (int i = 0; i < n; i++){
            for (int j = i+1;j< n;j++){
                if (nums[i]+nums[j]==target){
                    outputarr[0]=i;
                    outputarr[1]=j;
                    flag =true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        return outputarr;
        
    }
}