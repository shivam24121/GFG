class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n<=1 || arr[0]==0)return -1;
        
        int far=arr[0],end=0,steps=0;
        for(int i=0;i<n-1;i++){
            far=Math.max(far,arr[i]+i);
            if(i==end){
                end=far;
                steps++;
                if(end<=i)return -1;
            }
        }
        return steps;
    }
}
