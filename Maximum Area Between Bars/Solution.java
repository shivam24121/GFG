class Solution {
    public int maxArea(List<Integer> height) {
        
        int n=height.size();
        
        int res=0;
        
        int l=0;
        int r=n-1;
        
        while(l<r){
            int min=Math.min(height.get(l),height.get(r));
            res=Math.max(res,min*(r-l-1));
            
            if(height.get(l)<height.get(r)){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}
