class Solution {
    static class Pair{
        int sum;
        int i;
        int j;
        Pair(int sum,int i,int j){
            this.sum=sum;
            this.i=i;
            this.j=j;
        }
    }
    
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.sum,b.sum));
        for(int i=0;i<Math.min(k,arr1.length);i++){
            pq.offer(new Pair(arr1[i]+arr2[0],i,0));
        }
        while(k-->0 && !pq.isEmpty()){
            Pair curr=pq.poll();
            int i=curr.i;
            int j=curr.j;
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(arr1[i]);
            temp.add(arr2[j]);
            res.add(temp);
            
            if(j+1<arr2.length){
                pq.offer(new Pair(arr1[i]+arr2[j+1],i,j+1));
            }
        }
        return res;
    }
}
