public class DailyLc3{

public static void main(String args[])
{
    String s = "dbvmfhnttvr";
    int k = 5;
    System.out.println("OOut "+getLucky(s,k));
}

public static int getLucky(String s, int k) {
    int cnt=0;
    String findStr = "";
    int i;
    for(i=0;i<s.length();i++)
    {
       
        int x = s.charAt(i)-96;
        findStr += String.valueOf(x);
    }

//    System.out.println("findStr "+findStr);
    int ans = calculateString(findStr,k);
    return ans;
}

public static int calculateString(String findStr,int  k)
{
    
    int ans=0,i;
    int n = findStr.length();
    int temp = Integer.valueOf(findStr);
    if(n==1)
    {
        return temp;
    }
    
    int div=0;
    int rem;
    while(k!=0){

        while(temp!=0){
        div = temp%10;
        ans += div;
        temp = temp/10;
        }
        
        k--;
        System.out.println("Ans: "+ans);
        if(k!=0)
        {
            temp = ans;
            ans=0;
        }
}
    return ans;
}
}