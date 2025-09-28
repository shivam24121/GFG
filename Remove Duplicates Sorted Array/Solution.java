class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer>res=new ArrayList<>();
        res.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}
