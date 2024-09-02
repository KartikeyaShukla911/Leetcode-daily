/*
 * Implement queue using stack
 */


 public class Stack 
 {
    Queue<Integer> q;
    public Stack()
    {
        this.q = new Queue();
    }

    public int pop()
    {
       return q.remove();
    }

    public void push(int x)
    {
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
        q.add(x);
    }
    public int size()
        return q.size();
 }