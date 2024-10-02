// Rank Transform of an Array

public int[] Day2(int[] arr) {
    int n = arr.length;
    int i;

    int temp[] = new int[n];
    for(i=0;i<n;i++)
    {
        temp[i]=arr[i];
    }

    Arrays.sort(temp);
    HashMap<Integer,Integer> hm = new HashMap();
    int cnt=0;

    for(i=0;i<n;i++)
    {
        if(hm.containsKey(temp[i]))
        {
            hm.put(temp[i],cnt);
        }
        else
            hm.put(temp[i],++cnt);
    }

    for(i=0;i<n;i++)
    {
        arr[i] = hm.get(arr[i]);
    }

    return arr;
}