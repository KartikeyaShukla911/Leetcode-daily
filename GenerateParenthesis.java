public List<String> generateParenthesis(int n) {
        
    List<String> ans = new ArrayList();
    findPat(ans,n,0,0,"");
    return ans;
}

public static void findPat(List<String> ans, int n, int left,int right, String temp)
{
    if(temp.length() == n * 2)
    {
        ans.add(temp);
        return;
    }

    if(left < n)
    {
        findPat(ans,n,left+1,right,temp+"(");
    }

    if(right < left)
    {
        findPat(ans,n,left,right+1,temp+")");
    }
}