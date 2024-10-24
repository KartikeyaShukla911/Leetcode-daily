/*
 * Bottom view of a binary tree
 */

 import java.util.*;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;
    
    // Constructor to initialize
    // the node with a value
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class BottomViewofBT {
    // Function to return the
    // bottom view of the binary tree
    public List<Integer> bottomView(Node root) {
        // List to store the result
        List<Integer> ans = new ArrayList();

        Pair<Node,Integer> pair = new Pair();
        pair.add(root,0);

        HashMap<Integer,Integer> hm = new HashMap();
        Queue<Pair<Node,Integer> q= new LinkedList();
        q.add(pair);
        while(!q.isEmpty())
        {
            Pair<Node,Integer> temp = q.poll();
            Node curr = temp.getKey();
            int line = temp.getValue();

        
            hm.put(line,curr.val);

            if(curr.left)
            {
                q.add(new Pair<>(curr.left,line-1));
            }
            if(curr.right)
            {
                q.add(new Pair<>(curr.right,line+1));
            }
        }

        for(Map.Entry<Integer,Integer> mp : hm.entrySet())
        {
            ans.add(mp.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        BottomViewofBT bottomViewofBT = new BottomViewofBT();

        // Get the Bottom View traversal
        List<Integer> bottomView = bottomViewofBT.bottomView(root);

        // Print the result
        System.out.println("Bottom View Traversal: ");
        for(int node : bottomView) {
            System.out.print(node + " ");
        }
    }
}