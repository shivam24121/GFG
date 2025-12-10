class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer>res=new ArrayList<>();
        int n=arr.length;
        long ct=0;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                res.add(arr[i]);
            }
            ct+=arr[i];
            set.add(arr[i]);
        }
        long sum=(long)n*(n+1)/2;
        long x=sum-(ct-res.get(0));
        res.add((int)x);
        return res;
    }
}
