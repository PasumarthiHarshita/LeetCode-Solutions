class Solution {
    public boolean isPalindrome(int x) 
    {
        int sum=0;
        int Original=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum==Original)
           return true;
        else
            return false;
    }
}