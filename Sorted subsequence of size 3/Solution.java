class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        
        int low=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        int possible=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(possible>=arr[i]){
                possible=arr[i];
            }
            else if(mid>arr[i]){
                low=possible;
                mid=arr[i];
            }
            else{
                return new ArrayList<>(Arrays.asList(low,mid,arr[i]));
            }
        }
        return new ArrayList<>();
    }
}
