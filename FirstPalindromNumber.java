public String firstPalindrome(String[] words) {
        
    int n = words.length,i;
    if(n==0)
        return "";
    
    for(i=0;i<n;i++)
    {
        String temp = words[i];
        if(checkPalin(temp))
            return temp;
    }
    return "";
}

public static boolean checkPalin(String temp)
{
    int i,n=temp.length();
    for(i=0;i<n/2;i++)
    {
        if(temp.charAt(i)!=temp.charAt(n-1-i))
            return false;
    }
    return true;
}