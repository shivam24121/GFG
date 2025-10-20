import java.math.BigInteger;
class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        ArrayList<Integer>res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int left=0,right=0;
            for(int j=0;j<n;j++){
                if(i==j)continue;
                if(arr[j]>arr[i])right++;
                if(arr[j]<arr[i])left++;
            }
            long temp=catalan(left)*catalan(right);
            res.add((int)temp);
        }
        return res;
    }
    public long factorial(int n){
        long base=1;
        for(int i=2;i<=n;i++){
            base=base*i;
        }
        return base;
    }
    public long catalan(int n){
        long num=factorial(2*n);
        long den=factorial(n)*factorial(n+1);
        return num/den;
    }
}
