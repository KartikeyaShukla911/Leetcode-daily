//fractional knapsack

class Item
{
    int weight;
    int value;

    public Item(int x,int y)
    {
        this.weight=x;
        this.value=y;
    }

    public ItemComparator() implements Comparator<Item>
    {
        @Override
        public static void compare(Item a,Item b)
        {
            return a.value/a.weight < b.value/b.weight;
        }
    }
}


public static double knapsack(int arr[],int n)
{
    int i,j;

    Arrays.sort(arr,new ItemComparator());
    double ans=0;
    for(i=0;i<n;i++)
    {
        if(arr[i].weight <= W)
        {
            cap += arr[i].value;
            W-=arr[i].weight;
        }
        else if(W<=0)
            break;
        else
        {
            cap += double(arr[i].value/arr[i].weight) * W;
        }
    }
    return cap;
}