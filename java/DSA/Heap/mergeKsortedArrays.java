/*
Given K sorted arrays, merge them and print the sorted output.

Examples:

Input: K = 3, arr = { {1, 3, 5, 7}, {2, 4, 6, 8}, {0, 9, 10, 11}}
Output: 0 1 2 3 4 5 6 7 8 9 10 11 

Input: k = 4, arr = { {1}, {2, 4}, {3, 7, 9, 11}, {13} }
Output: 1 2 3 4 7 9 11 13
*/


public static void MergeKsortedArrays()
{
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            pq.add(arr[i][j]);
        }
    }

    ArrayList<Integer> arr = new ArrayList<>(pq);

    return arr;
}