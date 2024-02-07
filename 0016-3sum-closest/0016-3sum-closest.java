class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        
        int ans = Integer.MAX_VALUE;

        int result = 0;
        
        for(int i = 0; i < nums.length-2; i++)
        {
            int left = i+1, right = nums.length-1;
            
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                
                
                if(sum == target)
                {
                    return sum;
                }

                else if(Math.abs(sum - target) < Math.abs(ans))
                {
                    ans = sum - target;
                    result = sum;
                }

                if(sum > target)
                {
                    right--;
                }
                
                else
                {
                    left++;
                }
            }
        }
        
        return result;
    }
}