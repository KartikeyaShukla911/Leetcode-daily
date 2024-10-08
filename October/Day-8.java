/*
 * Min number of swaps needed to balance paranthese
 * https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
 */

 public int minSwaps(String s) {
    int cnt=0;
    char[] ch = s.toCharArray();
    for(char c : ch)
    {
        if(c=='[')
            cnt++;
        else if (cnt!=0)
            cnt--;
    }
    return (cnt+1)/2;
}