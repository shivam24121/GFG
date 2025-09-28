import java.util.*;
import java.util.stream.*;
class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        int n=arr.length;
        int l=0,r=0,max=0;
        int start=0;
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.lastKey()-map.firstKey()>x){
                int ct=map.get(arr[l]);
                if(ct==1){
                    map.remove(arr[l]);
                }
                else{
                    map.put(arr[l],ct-1);
                }
                l++;
            }
            if(r-l+1>max){
                max=r-l+1;
                start=l;
            }
            r++;
        }
        int[] res=Arrays.copyOfRange(arr,start,start+max);
        
        ArrayList<Integer>list=Arrays.stream(res)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }
}
