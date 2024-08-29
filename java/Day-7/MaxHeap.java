/*
 * Max Heap
 * 
 */


 int getMaxHeap()
 {
int max = arr.get(0);
    heapifyDow(0);
    return max;
 }

 void insert(int x)
 {
    arr.add(x);
    heapifyUp(n-1);
 }

 void swap(int a,int b)
 {
    int temp =arr.get(a);
    arr.set(a, arr.get(b));
    arr.set(b,temp);
 }

 void heapifyUp(int index)
 {
   while(index>=0)
   {
        int parent = index-1 / 2;
        if(arr.get(parent) < arr.get(index))
        {
            swap(arr,parent,index);
            index =parent;0
        }
        else
            break;
   }
 }

 void heapifyDow(int index)
 {
    int n = arr.size()-1;
    int lastIndex = n-1;

    while(index <= lastIndex)
    {
        left = arr.get(2*index+1);
        right = arr.get(2*index+2);
        larget = index;
    }

    if(left<larget && arr.get(left) > arr.get(largest))
    {
        largest = left;
    }

    if(right<largest && arr.get(right) > arr.get(largest))
    {
        largest = right;
    }

    if(index!=largest)
    {
        swap(arr,index,largest);
        index = largest;
    }
    else
    {
        break;
    }
 }