// Reverse words in java 

public class ReverseWords {
  
    public static void main(String args[])
    {
        String s = "Hello World";

        String sb[] = s.split(" ");
        
        int i,n=sb.length;
        String ans="";

        for(i=n-1;i>=0;i--)
        {
            if(i==0)
                ans+=sb[i];
            else
                ans+=sb[i]+" ";
        }

        System.out.println(ans);
    }
}