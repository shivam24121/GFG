
class Solution {
    public boolean isSubset(int a[], int b[]) {
        return solve(a,b);
    }
    public boolean solve(int[] a,int[] b){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:b){
            if(!map.containsKey(i) || map.get(i)==0){
                return false;
            }
            map.put(i,map.getOrDefault(i,0)-1);
        }
        return true;
    }
}
