class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        
        int exp=1;
        
        int i=0;
        int n=arr.length;
        
        while(i<n){
            
            ArrayList<Integer>list=new ArrayList<>();
            int j=0;
            
            while(i<n && j<exp){
                list.add(arr[i]);
                i++;
                j++;
            }
            Collections.sort(list);
            res.add(list);
            exp*=2;
        }
        return res;
    }
}
