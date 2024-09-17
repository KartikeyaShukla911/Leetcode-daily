/*1684. Count the Number of Consistent Strings*/


   public int countConsistentStrings(String allowed, String[] words) {
        int  n = allowed.length();
        int m = words.length;

        int i;
        int crr[] = new int[26];

        for(i=0;i<n;i++)
        {
            crr[allowed.charAt(i)-97]++;
        }

        int cnt=0;
        for(i=0;i<m;i++)
        {
            String temp = words[i];
            for(int j=0;j<temp.length();j++)
            {
                if(crr[temp.charAt(j)-97]==0)
                    break;
                else if(temp.length()-1 == j && crr[temp.charAt(j)-97]!=0)
                    cnt++;
            }
        }

        return cnt;
    }