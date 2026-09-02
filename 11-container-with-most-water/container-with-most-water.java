class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        //hello
        
        int max = Integer.MIN_VALUE;
        while(start<end){
            int width = end-start;
            max =Math.max(max,(width*Math.min(height[start],height[end])));
            if(height[start]>height[end]) end--;
            else start++;
        }
        return max;
    }
}