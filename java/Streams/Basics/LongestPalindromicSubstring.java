// Longest Palindromic Substring

/*
 * Given a string str, the task is to find the longest substring which is a palindrome. If there are multiple answers, then return the first appearing substring.

Examples:

Input: str = “forgeeksskeegfor” 
Output: “geeksskeeg”
 */
public class LongestPalindromicSubstring{
    
    public static void main(String args[])
    {
       String str = "forgeeksskeegfor";

       System.out.println("LPS"+optimizeLPS(str));
    }

    public static String findPalin(String str)
    {
        // brute force approach

        int i,j,n=str.length();
        int maxi = 0,start=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(checkPalin(str.substring(i,j)) && j-i+1>maxi)
                {
                    maxi = j-i+1;
                    start = i;
                }
            }
        }
        return str.substring(start,start+maxi-1);
    }
    
    public static Boolean checkPalin(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    public static String optimizeLPS(String s)
    {
        int n = s.length();
        int dp[][]=new int[n][n];

        int i,j;

        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                dp[i][j]=0;

        for(i=0;i<n;i++)
        {
            dp[i][i]=1;
        }

        String ans;
        int maxi=0;
        int start=0;
        //for 2 len

        for(i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                start=i;
                maxi=2;
            }
        }

        for(k=3;k<n;k++)
        {
            for(i=0;i<n-k+1;i++)
            {
                j=i+k-1;
                if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j))
                {
                    dp[i][j]=1;

                    if(k>maxi){
                        maxi = k;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start, start+maxi);
    }
}