class Solution {

    public static void main(String[] args)
    {
        System.out.println("Max valid string len: "+longestIdealString("acfgbd",2));
    }

    public static int longestIdealString(String s, int k) {
        int n = s.length();
        if(n==1)
            return 1;

        int i,j;
        int maxi = 0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                String subString = s.substring(i,j);
                int ns = subString.length();
                if(checkValidString(subString,ns,k))
                {
                    maxi = Math.max(maxi, ns);
                }
            }
        }
        return maxi;   
    }

    public static boolean checkValidString(String temp, int n, int k)
    {
        int i,j;
        if(n==1)
            return true;
        
        for(i=1;i<n-1;i++)
        {
            if(!(Math.abs(temp.charAt(i) - temp.charAt(i-1)) <=k && Math.abs(temp.charAt(i+1) - temp.charAt(i)) <=k))
                return false;
        }
        return true;
    }

    
}