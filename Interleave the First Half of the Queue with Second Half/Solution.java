class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        ArrayList<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll());
        }
        int i=0,j=res.size()/2;
        
        for(int x=0;x<res.size()/2;x++){
            q.offer(res.get(i++));
            q.offer(res.get(j++));
        }
    }
}
