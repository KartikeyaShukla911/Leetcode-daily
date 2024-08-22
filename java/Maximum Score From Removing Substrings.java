public class ClassNameHere {
 public int maximumGain(String s, int x, int y) {
        int n = s.length();
        if(n==1)
            return 0;
        
        int sum=0,i,j;
        int flagX = x > y ? x : y;

        String temp = s;
        
        int[] arr = new int[1];
        int cnt =0;
        if(flagX==x)
        {
            
            while(arr[0]!=-1)
            {
                arr[0]=0;
                char[] crr = findABCnt(temp,temp.length(),arr);
                temp = "";
                for(j=0;j<crr.length;j++)
                {
                    if(crr[j]!='0')
                        temp+=crr[j];
                }
                if(arr[0]!=0)
                    sum +=(x*arr[0]);
                else if(arr[0]<=0)
                    break;
            }
            arr[0]=0;
            while(cnt!=-1)
            {
                arr[0]=0;
                char[] crr = findBACnt(temp,temp.length(),arr);
                temp = "";
                for(j=0;j<crr.length;j++)
                {
                    if(crr[j]!='0')
                        temp+=crr[j];
                }
                if(arr[0]!=0)
                    sum +=(arr[0]*y);
                else if(arr[0]<=0)
                    break;
            }
        }
        else{
            while(arr[0]!=-1)
            {
                arr[0] = 0;
                char[] crr = findBACnt(temp,temp.length(),arr);
                temp = "";
                for(j=0;j<crr.length;j++)
                {
                    if(crr[j]!='0')
                        temp+=crr[j];
                }
                if(arr[0]!=0)
                    sum +=(arr[0]*y);
                else if(arr[0]<=0)
                    break;
            }
            arr[0] = 0;
            while(arr[0]!=-1)
            {
                arr[0] = 0;
                char[] crr = findABCnt(temp,temp.length(),arr);
                temp = "";
                for(j=0;j<crr.length;j++)
                {
                    if(crr[j]!='0')
                        temp+=crr[j];
                }
                if(arr[0]!=0)
                    sum +=(arr[0]*x);
                else if(arr[0]<=0)
                    break;
            }
        }
        return sum;
    }

    public static char[] findABCnt(String temp, int n , int[] cnt)
    {
        char[] res = temp.toCharArray();
        for(int i=1;i<n;i++)
        {
            if(res[i]=='b' && res[i-1]=='a')
            {
                cnt[0]++;
                res[i]=res[i-1]='0';
            }
        }
        return res;
    }

    public static char[] findBACnt(String temp, int n , int[] cnt)
    {
        char[] res = temp.toCharArray();
        for(int i=1;i<n;i++)
        {
            if(res[i]=='a' && res[i-1]=='b')
            {
                cnt[0]++;
                res[i]=res[i-1]='0';
            }
        }
        return res;
    }
}




---------------------------------------

class Solution {
    public int maximumGain(String s, int x, int y) {
        
        int i,j;
        int aCount=0,bCount=0;
        int n = s.length();
        int ans = 0;

        int lesser = Math.min(x,y);
        for(i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c > 'b')
            {
                ans += Math.min(aCount,bCount) * lesser;
                aCount=bCount=0;
            }
            else if(c=='a')
            {
                if(y > x && bCount>0)
                {
                    bCount--;
                    ans += y;
                }
                else
                {
                    aCount++;
                }
            }
            else
            {
                if(x > y && aCount>0)
                {
                    aCount--;
                    ans +=x;
                }
                else
                {
                    bCount++;
                }
            }
        }
        ans += Math.min(aCount,bCount) * lesser;
        return ans;
    }
}