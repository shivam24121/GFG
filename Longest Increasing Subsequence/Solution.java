class Solution {
    static int lis(int arr[]) {
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i:arr){
            int idx=Collections.binarySearch(res,i);
            
            if(idx<0)idx=-(idx+1);
            
            if(idx<res.size()){
                res.set(idx,i);
            }
            else{
                res.add(i);
            }
        }
        return res.size();
    }
}
