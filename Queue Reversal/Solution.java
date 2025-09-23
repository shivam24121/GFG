class Solution {
    public void reverseQueue(Queue<Integer> q) {
        if(q.isEmpty())return;
        Integer n=q.remove();
        reverseQueue(q);
        q.add(n);
    }
}
