/*
 * Find all unique combinations
 * Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8

Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]]
 */


static void uniqueComb(int arr[],int n)
{
    List<List<integer>> ans;
    List<integer> res;

}


static void findComb(int index,int arr[],int n, List<list<Integer>> ans,
    List<Integer> res)
    {

        if(target==0)
        {
            ans.add(res);
            return ;
        }

        if(arr[index]<=target)
        for(int i=index;i<n;i++)
        {
            if(i> index && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break; // because all elements are sorted

            res.add(arr[i]);
            findComb(i+1,arr,n,res,ans,tar-arr[i]);
            res.remove(res.size());
        }
        
    } // O(2^n*k)