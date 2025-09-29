class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.offer(i);
            if(pq.size()>arr.length-k){
                res.add(pq.poll());
            }
        }
        Collections.sort(res,Collections.reverseOrder());
        return res;
    }
}
