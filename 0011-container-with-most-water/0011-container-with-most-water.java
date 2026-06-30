class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            int hei=Math.min(height[left],height[right]);
            int wid=right-left;
            area=Math.max(area, hei*wid);
           if(height[left]<height[right])left++;
           else right--;
        }
        return area;
    }
}

/*
    Use two pointers at both ends. For each pair, calculate the area as
    min(leftHeight, rightHeight) * width and update the maximum area.
    Always move the pointer with the smaller height because the shorter wall
    limits the water level. Moving the taller wall only decreases the width
    without increasing the limiting height.
    Time: O(n), Space: O(1)
 */