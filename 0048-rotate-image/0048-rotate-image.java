class Solution 
{
    public void rotate(int[][] matrix) 
    {
        // Find transpose first
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                swap(matrix, i, j);
            }
        }
        
        for(int i = 0; i < matrix.length; i++)
        {
            reverse(matrix, i);
        }
    }
    
    public void swap(int[][] arr, int x, int y)
    {
        int temp = arr[x][y];
        arr[x][y] = arr[y][x];
        arr[y][x] = temp;
    }
    
    public void reverse(int[][] arr, int i)
    {
        int left = 0, right = arr[0].length-1;
        
        while(left <= right)
        {
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;
            left++;
            right--;
        }
    }
}