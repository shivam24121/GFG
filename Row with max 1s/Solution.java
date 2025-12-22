class Solution {
    public int rowWithMax1s(int arr[][]) {
        int row=arr.length;
        int col=arr[0].length;
        
        int res=-1;
        
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(arr[j][i]==1){
                    return j;
                }
            }
        }
        return res;
    }
}
