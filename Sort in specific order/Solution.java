class Solution {
    public void sortIt(int[] arr) {
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        for(int i:arr){
            if((i&1)==1){
                odd.add(i);
            }
            else{
                even.add(i);
            }
        }
        int idx=0;
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        for(int i=0;i<odd.size();i++){
            arr[idx++]=odd.get(i);
        }
        for(int i=0;i<even.size();i++){
            arr[idx++]=even.get(i);
        }
    }
}
