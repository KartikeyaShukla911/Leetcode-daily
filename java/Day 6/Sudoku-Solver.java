/*
 * Sudoku Solver


32

0
Problem Statement:

Given a 9x9 incomplete sudoku, solve it such that it becomes valid sudoku. Valid sudoku has the following properties.
 */

 public static boolean printValidSudoku(int arr[][])
 {
    int n = 10;
    int arr[][] = {
        {0,0,0,0,0,0,0,0,0,0},
        {1,0,0,0,0,0,0,0,0,0},
        {0,2,0,0,0,0,0,0,0,0},
        {0,0,3,0,0,0,0,0,0,0},
        {0,0,0,4,0,0,0,0,0,0},
        {0,0,0,0,5,0,0,0,0,0},
        {0,0,0,0,0,6,0,0,0,0},
        {0,0,0,0,0,0,7,0,0,0},
        {0,0,0,0,0,0,0,8,0,0},
    };

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i][j]==0)
            {
                for(k=1;k<=9;k++)
                    if(isSafe(arr,i,j,k)==true)
                    {
                        arr[i][j]=k;
                        
                        if(printValidSudoku(arr))
                        {
                            return true;
                        }
                        else
                        {
                            arr[i][j]=0;
                        }
                    }
            }
        }
    }
    return false;
 }

 public static boolean isSafe(int arr[][],int row,int col,int k)
 {
    int duprow = row;
    int dupcol = col;

    for(i=0;i<n;i++)
    {
        if(arr[i][col]==k)
            return false;
    }

    for(i=0;i<n;i++)
    {
        if(arr[row][i]==k)
            return false;
    }

    for(i=0;i<n;i++)
    {
        if(arr[i * row/3 + i/3][i*col/3 + i%3]==k)
            return false;
    }
    return true;
 }

 