class Solution {
    public int minSteps(int[] arr, int start, int end) {
        
        int n=arr.length;
        
        Set<Integer>set=new HashSet<>();
        Queue<Integer>q=new ArrayDeque<>();
        
        int mod=1000;
        
        q.offer(start);
        set.add(start);
        
        int ct=0;
        
        while(!q.isEmpty()){
            
            int size=q.size();
            
            for(int i=0;i<size;i++){
                
                int curr=q.poll();
                
                if(curr==end){
                    return ct;
                }
                for(int x:arr){
                    int val=(x*curr)%mod;
                    if(!set.contains(val)){
                        set.add(val);
                        q.offer(val);
                    }
                }
            }
            ct++;
        }
        return -1;
    }
}
