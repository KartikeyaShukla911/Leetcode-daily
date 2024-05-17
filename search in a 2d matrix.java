// Search in a 2d matrix


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

       

        if(n==1 && m==1)
        {
            return target == matrix[0][0] ? true: false;
        }
        
        for(int i=0;i<n;i++)
        {
            return searchMatrix(matrix[i],0,m-1,target);
        }
        return false;
    }

    public boolean searchMatrix(int mat[], int low,int high,int target)
    {
      
       while(low<=high)
       {
        int mid = (low + high) >> 1;
        if(mat[mid]==target)
            return true;
        
        else if(mat[mid]>target)
            high--;
        else
            low++;
       }
       return false;
    }
}

-------------------------------


public boolean searchMatrix(int[][] matrix, int target) {
        
    int n = matrix.length,m=matrix[0].length,i,j;
    i=0;j=n-1;

    while(i<n && j>=0)
    {
        System.out.println("Ans: "+matrix[i][j]);
        if(matrix[i][j]==target)
            return true;
        
        else if(matrix[i][j] < target)
            i++;
        else
            j--;
    }
    return false;
}