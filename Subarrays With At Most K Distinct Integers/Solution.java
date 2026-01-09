class Solution {
    public int countAtMostK(int arr[], int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int res=0;
        int l=0;
        
        for(int r=0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            
            while(map.size()>k){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            res+=(r-l+1);
        }
        return res;
    }
}
