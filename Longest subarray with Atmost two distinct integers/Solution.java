class Solution {
    public int totalElements(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        int l=0;
        int res=0;
        int ct=0;
        for(int r=0;r<arr.length;r++){
            if(map.getOrDefault(arr[r],0)==0){
                ct++;
            }
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            
            while(ct>2){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l])==0){
                    ct--;
                }
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
