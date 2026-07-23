 Stack<Integer> st=new Stack<>();
        int low=Integer.MIN_VALUE;

        for(int x:arr){
            if(x<low)return false;

            while(!st.isEmpty()&&x>st.peek())
                low=st.pop();

            st.push(x);
        }

        return true;
