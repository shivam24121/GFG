class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        int res=0,curr=0;
        while(pq.size()>1){
            curr=0;
            int a=pq.poll();
            int b=pq.peek();
            curr=a+b;
            res+=curr;
            pq.poll();
            pq.offer(curr);
        }
        //if(pq.size()==1)res+=pq.peek();
        return res;
    }
}
