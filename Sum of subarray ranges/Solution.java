class Solution {
    public int subarrayRanges(int[] arr) {
        int n=arr.length;
        
        int[] nsr=NSR(arr);
        int[] nsl=NSL(arr);
        int[] ngl=NGL(arr);
        int[] ngr=NGR(arr);

        long res=0;
        
        for(int i=0;i<n;i++){
            long small=((long)i-nsl[i])*(nsr[i]-i)*arr[i];
            long big=((long)i-ngl[i])*(ngr[i]-i)*arr[i];
            
            res=(res+(big-small));
        }
        return (int)res;
    }
    public int[] NSL(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] res=new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] NSR(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] res=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] NGL(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] res=new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] NGR(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] res=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return res;
    }
}
