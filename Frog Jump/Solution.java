class Solution {
    int minCost(int[] height) {
        int prev2=0,prev1=0;
        for(int i=1;i<height.length;i++){
            int one=prev1+Math.abs(height[i]-height[i-1]);
            int two=Integer.MAX_VALUE;
            if(i>1){
                two=prev2+Math.abs(height[i]-height[i-2]);
            }
            int curr=Math.min(one,two);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
