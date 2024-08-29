/*
 * k frequent elements
 * Input: arr[] = {3, 1, 4, 4, 5, 2, 6, 1}, K = 2
Output: 4 1
Explanation:
Frequency of 4 = 2, Frequency of 1 = 2
These two have the maximum frequency and 4 is larger than 1.

Input: arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}, K = 4
Output: 5 11 7 10
Explanation: 
Frequency of 5 = 3, Frequency of 11 = 2, Frequency of 7 = 2, Frequency of 10 = 1
These four have the maximum frequency and 5 is largest among rest.


*/


static void topKfrequent(int arr[],int n)
{

    Map<Integer,Integer> mp = new HashMap();

    for(i=0;i<n;i++)
    {
        mp.put(arr[i],mp.getOrDefault(arr[i],0),1);
    }

    PriorityQueue<Map.Entry<Integer,Integer>> mp =
    new PriorityQueue<>(
        (a,b)-> a.getValue().equals(b.getValue())
        ?
        Integer.compare(b.getKey(),a.getKey())
        :
        Integer.compare(b.getValue(),a.getValue());
    );

    for(Map.Entry<Integer,Integer> entry:
        mp.entrySet()){
            queue.offer(entry);
    }

    for(i=0;i<k;i++)
        queue.poll();
}

