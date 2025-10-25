class Solution {
    public int minOperations(int[] arr) {
        PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());
        long total=0;
        for(int i:arr){
            total+=i;
            pq.offer((double)i);
        }
        double half=total/2.0;
        
        double curr=0;
        int ct=0;
        
        while(curr<half){
            double temp=pq.poll();
            temp=temp/2.0;
            curr+=temp;
            pq.offer(temp);
            ct++;
        }
        return ct;
    }
}
