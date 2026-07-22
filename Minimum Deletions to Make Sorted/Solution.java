class Solution {
    public int minDeletions(int[] arr) {
        
        ArrayList<Integer>list=new ArrayList<>();
        
        int n=arr.length;
        for(int i:arr){
            
            int idx=Collections.binarySearch(list,i);
            
            if(idx<0){
                idx=-(idx+1);
            }
            if(idx<list.size()){
                list.set(idx,i);
            }
            else{
                list.add(i);
            }
        }
        return n-list.size();
    }
}
