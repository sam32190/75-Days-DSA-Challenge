class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int[] ans = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] *= nums[i]; 
        }
        
        int i = 0, j = nums.length-1, k = nums.length-1;
        
        while(i <= j)
        {
            if(nums[i] < nums[j])
            {
                ans[k--] = nums[j];
                j--;
            }
            
            else
            {
                ans[k--] = nums[i];
                i++;
            }
        }
        
        return ans;
    }
}