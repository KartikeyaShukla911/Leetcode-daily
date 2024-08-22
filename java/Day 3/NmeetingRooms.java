/*
 * N meetings in one room


54

3
Problem Statement: There is one meeting room in a firm. You are given two arrays, start and end each of size N.For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting. Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time. Print the order in which these meetings will be performed.

Example:

Input:  N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}

Output: 1 2 4 5

 */

class Meeting
{
    int start;
    int end;
    int pos;

    public Meeting(int x,int y,int z)
    {
        this.start=x;
        this.end=y;
        this.pos=z;
    }

}

class MeetingComparator implements Comparator<Meeting>
{
    @Override
    public int compare(Meeting a,Meeting b)
    {
        if(a.end < b.end)
            return -1;
        else if(a.end>b.end)
            return 1;
        else if(a.pos<b.pos)
        {
            return -1;
        }
    }
}


class Nmeeting
{
    public static int countMeeting(int start[],int end[],int n)
    {
        Meeting mrr[] = new Meeting[n];
        for(int i=0;i<n;i++)
        {
            Meeting m = new Meeting(start[i],end[i],i+1);
        }

        Arrays.sort(mrr,new MeetingComparator());

        List<Integer> ans = new ArrayList();
        ans.add(mrr[0].pos);
        for(i=1;i<n;i++)
        {
            if(mrr[i-1].pos < mrr[i].start)
            {
                ans.add(mrr[i].pos);
            }
        }
        return ans;
    }
}