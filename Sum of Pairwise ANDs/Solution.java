class Solution {
    public long pairAndSum(int[] arr) {
        
        int n=arr.length;
        long res=0;
        
        int[] bit=new int[32];
        
        for(int mask=0;mask<32;mask++){
            
            for(int i:arr){
                
                if((i&(1<<mask))!=0){
                    res+=1L*(1<<mask)*bit[mask];
                    bit[mask]++;
                }
            }
        }
        return res;
    }
}

//   1111
    
//   0101    5
//   1010    10
//   1111    15
  
//   1111
  
//   111111 
  
//   001010  10
//   010100  20
//   011110  30
//   101000  40
  
//   013110
  
//   16+3(8)+4+2=46
