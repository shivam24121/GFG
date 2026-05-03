class Solution {
    ArrayList<Integer> sortBySetBitCount(int[] arr) {
        
        Integer[] temp = new Integer[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int i = Integer.bitCount(a);
            int j = Integer.bitCount(b);

            if(i != j){
                return Integer.compare(j, i);
            }
            return 0; // stable tie
        });

        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < temp.length; i++){
            res.add(temp[i]);
        }

        return res;
    }
}
