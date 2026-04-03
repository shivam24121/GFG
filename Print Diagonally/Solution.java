class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        
        int n=mat.length;
        int m=mat[0].length;
        
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }
        int max=n+n-2;
        boolean fl=true;
        int i=0;
        
        while(i<=max){
            if(fl){
                for(int j:map.get(i)){
                    res.add(j);
                }
                fl=!fl;
            }
            else{
                // Collections.reverse(map.get(i));
                
                for(int j:map.get(i)){
                    res.add(j);
                }
                fl=!fl;
            }
            i++;
        }
        return res;
    }
}
