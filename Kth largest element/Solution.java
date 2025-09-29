class Solution {
    public static int KthLargest(int arr[], int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.offer(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}
