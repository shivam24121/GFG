class kQueues {
    
    ArrayList<Deque<Integer>>arr;
    int n;
    int size;

    kQueues(int n, int k) {
        this.n=n;
        arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            arr.add(new ArrayDeque<>());
        }
        size=0;
    }

    void enqueue(int x, int i) {
        arr.get(i).offer(x);
        size++;
    }

    int dequeue(int i) {
        if(arr.get(i).isEmpty()){
            return -1;
        }
        size--;
        return arr.get(i).poll();
    }

    boolean isEmpty(int i) {
        return arr.get(i).isEmpty();
    }

    boolean isFull() {
        return n==size;
    }
}
