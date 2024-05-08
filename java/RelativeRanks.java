// Relative Ranks in given list
// https://leetcode.com/problems/relative-ranks/description/?envType=daily-question&envId=2024-05-08

public String[] findRelativeRanks(int[] score) {
    int n = score.length;
    String arr[] = new String[n];
    if(n==1)
    {
        arr[0]="Gold Medal";
        return arr;
    }
    
    int temp[] = new int[n];
    int i;
    for(i=0;i<n;i++)
        temp[i]=score[i];
    
    Arrays.sort(temp);

    for(i=0;i<n/2;i++)
    {
        int x = temp[i];
        temp[i]=temp[n-i-1];
        temp[n-i-1]=x;
    }

    for(int xx : temp)
    System.out.println("ans: "+xx);

    HashMap<Integer,String> hm = new HashMap();
    for(i=0;i<n;i++)
    {
        if(i==0)
            hm.put(temp[i],"Gold Medal");
        
        else if(i==1)
            hm.put(temp[i],"Silver Medal");
        
        else if(i==2)
            hm.put(temp[i],"Bronze Medal");
        else
            hm.put(temp[i],String.valueOf(i+1));
    }

    for(i=0;i<n;i++)
    {
        arr[i] = hm.get(score[i]);
    }
    return arr;
}