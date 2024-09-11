/*
 * LRU cache implementation
 */


 public class Node
 {

    int val;
    Node next;
    
    Node prev;
    
    public Node(int val)
    {
        
    }
    class LRUcache()
    {
        Node head = new Node(0,0);   

    }

    public static void main(String args[])
    {
        LRUcache head = new LRUcache(3);

    }
 }