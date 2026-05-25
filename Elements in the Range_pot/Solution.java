class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
     
        Set<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        
        for(int i=start;i<=end;i++){
            if(set.contains(i)==false){
                return false;
            }
        }
        return true;
    }
}
