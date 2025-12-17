class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]>res=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        int start=arr[0][0];
        int end=arr[0][1];
        
        for(int i=1;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            if(a<=end){
                end=Math.max(end,b);
            }
            else{
                res.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res;
    }
}
