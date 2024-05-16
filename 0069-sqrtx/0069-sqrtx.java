class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x/2;
        long ans=0;
        if(x==0 || x==1){
            return x;
        }
      
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid<=x){
                 ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)ans;
        
        
    }
}