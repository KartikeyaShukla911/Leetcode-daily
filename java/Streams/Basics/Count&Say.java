// Count and Say

class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String result = "1";
        for(int i=1;i<n;i++)
        {
            result = helper(result);
        }
        return result;
    }
    public static String helper(String result)
    {
        int n = result.length();
        StringBuilder sb = new StringBuilder();
        int i;
        int cnt=1;
        for(i=1;i<n;i++)
        {
            if(result.charAt(i)==result.charAt(i-1))
            {
                cnt++;
            }
            else
            {
                sb.append(cnt).append(result.charAt(i-1));
                cnt=1;
                
            }
        }

        sb.append(cnt).append(result.charAt(n-1));
        result=sb.toString();
        return result;
    }
}