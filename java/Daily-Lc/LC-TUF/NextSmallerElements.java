// Next smaller element in array

/*
 * Input: [4, 8, 5, 2, 25]
Output: [2, 5, 2, -1, -1]
Explanation:
The first element smaller than 4 having index > 0 is 2.
The first element smaller than 8 having index > 1 is 5.
The first element smaller than 5 having index > 2 is 2.
There are no elements smaller than 4 having index > 3.
There are no elements smaller than 4 having index > 4.
 */

import java.util.Stack;

public static void NextSmallerElement(int arr[],int n)
 {
    if (n==0 || n==1) {
        return;
    }
    
    Stack<Integer> st = new Stack();
    for(i=n-1;i>=0;i--)
    {
        if(i==n-1)
        {
            st.push(arr[i]);
            arr[i]=-1;
        }
        else
        {
            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }

            if(!st.isEmpty()){
                arr[i]=st.peek();
                
            }
            else
                arr[i]=-1;

            st.push(arr[i]);
        }
    }
}