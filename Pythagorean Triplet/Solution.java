class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        HashSet<Long>set=new HashSet<>();
        for(int i:arr){
            set.add((long)i*i);
        }
        for(long a:set){
            for(long b:set){
                if(set.contains(a+b)){
                    return true;
                }
            }
        }
        return false;
    }
}
