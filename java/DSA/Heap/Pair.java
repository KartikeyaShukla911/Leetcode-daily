//KMaxCombinations

public static class Pair
{
    public Pair(int l,int m)
    {}

}

public static class PairSum implements Comparable<PairSum>
{
    public PairSum(int sum,int l,int m)
    {

    }

    @Override
    public int compareTo(PairSum o)
    {
        return Integer.compareTo(o.sum, sum);
    }
}

/*
 * K maximum sum combinations from two arrays
Last Updated : 10 Jul, 2023
Given two equally sized arrays (A, B) and N (size of both arrays). 
A sum combination is made by adding one element from array A and another element of array B. Display the maximum K valid sum combinations from all the possible sum combinations. 
Input :  A[] : {3, 2} 
         B[] : {1, 4}
         K : 2 [Number of maximum sum
               combinations to be printed]
Output : 7    // (A : 3) + (B : 4)
         6    // (A : 2) + (B : 4)
Input :  A[] : {4, 2, 5, 1}
         B[] : {8, 0, 3, 5}
         K : 3
Output : 13   // (A : 5) + (B : 8)
         12   // (A : 4) + (B :  8)
         10   // (A : 2) + (B : 8) 
*/

// brute force
static void KMaxCombinations(int A[],int B[],int N,int K
{

    PriorityQueue<Integer> pq = new PriorityQueue
        <Integer>(Collections.reverseOrder());
    
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            pq.add(A[i]+B[j]);
        }
    }
    
    int  sum =0;
    for(i=0;i<K;i++)
    {
        sum = pq.poll();
    }

    return sum;
    //O(N^2 log N^2)
    // S(N^2)
}

// optimized -- using priority queue along with map to store indices

public static void MaxPairSum()
{
    Arrays.sort(A);
    Arrays.sort(B);

    PriorityQueue<PairSum> sums = new PriorityQueue<>();
    
    HashSet<Pair> pairs = new HashSet();

    int l=N-1;
    int m = N-1;

    pairs.add(new Pair(l,m));
    sums.add(new PairSum(A[l]+B[m],l,m));

    for(i=0;i<k;i++)
    {
        PairSum = sums.poll();
        //out
        l=max.l-1;
        m=max.m;

        if(l>=0 && m>=0 && !pairs.contains(new Pair(l,m)))
        {
            sums.add(new PairSum(A[l]+B[m],l,m));
            pairs.add(new Pair(l,m);
            )
        }

        l=max.l;
        m=max.m-1;

        if(l>=0 && m>=0 && !pairs.contains(new Pair(l,m)))
        {
            sums.add(new PairSum(A[l]+B[m],l,m));
            pairs.add(new Pair(l,m);
            )
        }
 // O nlog N
    }
}