

// optimal approach

/*
 * Subset - II | Print all the Unique Subsets
 * Given an array of integers that may contain duplicates the task is to return all possible subsets. Return only unique subsets and they can be in any order.

Examples:

Example 1:

Input: array[] = [1,2,2]
https://takeuforward.org/data-structure/subset-ii-print-all-the-unique-subsets/

 */



 public void uniqueSubset(int arr[],int n)
 {
    List<Integer> res = new ArrayList();
    Set<List<Integer>> ans = new ArrayList();
    Arrays.sort(arr);
    findSubset(arr,n,res,ans,0);
 }


 public static void findSubset(int ...)
 {
    if(index==n)
    {
        ans.add(res);
        return ;
    }

    for(int i = index;i<n;i++)
    {
        if(i!=index &&  arr[i]==arr[i-1])
            continue;
        
        findSubset(arr,n,res,ans,i+1);
        res.remove(res.size()-1);
    }
    
 } // O(2^n * k for generating subsets)

 ---------------

 // brute approach


 static void findSubset(int index,int arr[],int n,List<Integer> res,Set<Integer> ans)
 {
    if(index==n)
    {
        Collection.sort(res);
        ans.add(res)
        return ;
    }

    res.add(arr[index]);

    findSubset(index+1,arr,n,res,ans);
    res.remove(res.size()-1);
    findSubset(index+1,arr,n,res,ans);
 }

 // O(2^n * k log (x))