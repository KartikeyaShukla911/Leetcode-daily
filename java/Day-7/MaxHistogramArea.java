/*
 * Maximum area of a histogram
 */


 public static int maxHistogram(int arr[],int n)
 {
    Stack<Integer> st = new Stack();
    int lrr[] = new int[n];
    int rrr[] = new int[n];

    int i;

    for(i=0;i<n;i++)
    {
        int curr = arr[i];

        while(!st.isEmpty() && arr[st.peek()]>curr)
            st.pop();
        
        if(st.isEmpty())
        {
            lrr[i]=0;
        }
        else
        {
            lrr[i]=arr[st.peek()];
        }
        st.push(i);
    }

    for(i=n-1;i>=0;i--)
    {
        int curr = arr[i];

        while(!st.isEmpty() && arr[st.peek()]>curr)
            st.pop();
        
        if(st.isEmpty())
        {
            rrr[i]=0;
        }
        else
        {
            rrr[i]=arr[st.peek()];
        }
        st.push(i);
    }

    for(i=0;i<n;i++)
    {
        ans = Math.max(ans,arr[i] * (Math.min(lrr[i],rrr[i]) +1));
    }
    return ans;
 }