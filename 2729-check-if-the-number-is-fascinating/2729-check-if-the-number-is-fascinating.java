class Solution 
{
    public boolean isFascinating(int n) 
    {
        if(n < 100) return false;
        
        int[] freq = new int[10];
        
        String num = "" + n + (n * 2) + (n * 3);
        
        for(int i = 0; i < num.length(); i++)
        {
            int digit = num.charAt(i) - '0';
            
            if(freq[digit] > 0 || digit == 0)
            {
                return false;
            }
            
            else
            {
                freq[digit]++;
            }
        }
        
        return true;
    }
}