class MyStack {
    int top;
    int arr[];
    int size;
    
    MyStack(){
        size=100;
        arr=new int[size];
        top=-1;
    }

    public void push(int x) {
        if(top==size-1){
            return;
        }
        arr[++top]=x;
        
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        return arr[top--];
    }
}
