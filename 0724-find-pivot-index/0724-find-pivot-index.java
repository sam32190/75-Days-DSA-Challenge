class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        
        int lsum = 0, rsum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            rsum = sum - (nums[i] + lsum);
            
            if(lsum == rsum)
            {
                return i;
            }
            
            lsum = lsum + nums[i];
        }
        
        return -1;
    }
}