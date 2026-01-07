class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        
        ArrayList<Integer>res=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        res.add(map.size());
        
        for(int i=k;i<arr.length;i++){
            int prev=arr[i-k];
            map.put(prev,map.getOrDefault(prev,0)-1);
            if(map.get(prev)==0){
                map.remove(prev);
            }
            int curr=arr[i];
            map.put(curr,map.getOrDefault(curr,0)+1);
            res.add(map.size());
        }
        return res;
    }
}
