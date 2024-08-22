/*
 * Find K-th Permutation Sequence


23

1
Problem Statement: Given N and K, where N is the sequence of numbers from 1 to N([1,2,3..... N]) find the Kth permutation sequence.
 */

// kth permutation

/*
 * Example 1:

Input: N = 3, K = 3
 
Output: “213”
 */

static void kthPermute(int index,int arr[],int n,List<List<Integer>> ans,
List<Integer> res)
{
    if(index==n)
    {
        Collection.sort(res);
        ans.add(res);
        return;
    }

    for(i=index;i<n;i++)
    {
        swap(arr,s,i,index);
        findKpermute(i,arr,n,ans,res);
        swap(arr,s,i,index);
    }
}

// O - N! * N

static void swap(String s,int a,int b)

//---------------------

static void Kpermute(int n,int k)
{
    int fact = 1;
    for(int i=0;i<n;i++)
    {
        int x = i+1;
        fact = fact * x;
        ls.add(x);
    }
    k--;

    while(true)
    {
        ans = ans + " " + ls.get(k/fact);
        ls.remove(k/fact);
        if(ls.size()==0)
            break;
        
        k = k/fact;
        fact = fact/numbers.size();
    }
}

return ans;