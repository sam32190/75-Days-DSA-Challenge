class Solution 
{
    public double myPow(double x, int n) 
    {
        long newPow = (long)n;

        if(n < 0)
        {
            newPow = -1 * newPow;
        }

        double ans = 1.0;

        while(newPow > 0)
        {
            if((newPow & 1) == 1)
            {
              ans = ans * x;
            }

            x = x * x;
            newPow >>= 1;
        }

        if(n < 0)
        {
            ans = (double)(1 / ans);
        }

        return(ans);
    }
}