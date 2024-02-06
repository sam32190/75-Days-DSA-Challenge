class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int m = matrix.length, n = matrix[0].length;
        
        List<Integer> ans = new ArrayList<>();
        
        int total = m * n, count = 0;
        
        int top = 0, bottom = m-1;
        
        int left = 0, right = n-1;
        
        while(count < total)
        {
            for(int i = left; i <= right && count < total; i++)
            {
                ans.add(matrix[top][i]);
                count++;
            }
            top++;
            
            for(int i = top; i <= bottom && count < total; i++)
            {
                ans.add(matrix[i][right]);
                count++;
            }
            right--;
            
            for(int i = right; i >= left && count < total; i--)
            {
                ans.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            
            for(int i = bottom; i >= top && count < total; i--)
            {
                ans.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        
        return ans;
    }
}