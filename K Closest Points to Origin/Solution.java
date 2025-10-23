class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->Integer.compare(sq(b),sq(a)));
        
        for(int[] pt:points){
            pq.add(pt);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            ArrayList<Integer>curr=new ArrayList<>();
            curr.add(temp[0]);
            curr.add(temp[1]);
            res.add(curr);
        }
        return res;
    }
    public int sq(int[] a){
        return a[0]*a[0]+a[1]*a[1];
    }
}
