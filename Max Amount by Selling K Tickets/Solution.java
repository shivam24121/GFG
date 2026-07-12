class Solution {
    public int maxAmount(int[] arr, int k) {
        
        int n=arr.length;
        long res=0;
        int mod=(int)1e9+7;
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int e:map.keySet()){
            pq.offer(e);
        }
        while(!pq.isEmpty() && k>0){
            
            int temp=pq.peek();
            
            if(temp<=0)break;
            
            res=(res+temp)%mod;
            // System.out.print(temp+" ");
            
            int freq=map.get(temp);
            if(freq<=1){
                map.remove(temp);
                pq.poll();
            }
            map.put(temp,map.getOrDefault(temp,0)-1);
            map.put(temp-1,map.getOrDefault(temp-1,0)+1);
            if(map.get(temp-1)==1){
                pq.offer(temp-1);
            }
            
            k--;
        }
        // System.out.println(14+13+12+11+11+11+11+10+10+10+10+9+9+9+9+8);
        return (int)res;
    }
}
