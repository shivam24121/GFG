class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<=k && i<arr.length;i++){
            pq.add(arr[i]);
        }
        int idx=0;
        
        for(int i=k+1;i<arr.length;i++){
            arr[idx++]=pq.poll();
            pq.add(arr[i]);
        }
        
        while(!pq.isEmpty()){
            arr[idx++]=pq.poll();
        }
    }
}
