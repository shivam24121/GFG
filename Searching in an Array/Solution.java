
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        int res=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                res=i+1;
                break;
            }
        }
        return res;
    }
}
