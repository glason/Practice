/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container.
 */
public class Solution {
    public int maxArea(int[] height) {
	int water=0;
	int left=0,right=height.length-1;
	while(left<right){
	    int h=Math.min(height[left],height[right]);
	    int nwater=(right-left)*h;
	    if(nwater>water){
		water=nwater;
	    }
	    if(height[left]<height[right]){
		left++;
	    }else{
		right--;
	    }
	}
	return water;
    }
}
