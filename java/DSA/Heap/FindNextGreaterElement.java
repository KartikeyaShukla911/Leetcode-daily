/*
 * find next greater elements
 */

 public static int nextGreater(int arr[],int n)
 {
    Stack<Integer> st = new Stack();

    for(i=2*(n-1);i>=0;i--)
    {
        while(!st.isEmpty() && st.peek()<=arr[i%n])
            st.pop();
        
        if(i<n)
        {
            if(!st.isEmpty())
                nge[i]=st.pop();
            else 
                nge[i]=-1;
        }

        st.push(arr[i%n]);
    }
 }