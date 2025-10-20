class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            int comp=map.get(b)-map.get(a);
            if(comp==0)return b-a;
            return comp;
        });
        pq.addAll(map.keySet());
        
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(pq.poll());
        }
        return res;
    }
}
