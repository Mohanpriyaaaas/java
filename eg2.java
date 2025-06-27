class Solution {
    public boolean isPalindrome(int x) {
     if(x<0)
     {
        return false;

     }
    int res=0;
    int x1=x;
    while(x>0){
        res=res*10+(x%10);
        x/=10;
    }  
    return x1==res ;
    }
}
