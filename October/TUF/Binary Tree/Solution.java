import java.util.ArrayList;
import java.util.List;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {
    // Function to perform iterative Morris
    // inorder traversal of a binary tree
    public List<Integer> getInorder(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        if(root==null)
            return ans;
        
        TreeNode curr = root;

        while(curr!=null)
        {
            if(curr.left==null)
            {
                ans.add(curr.val);
                curr=curr.right;
            }
            else
            {
                TreeNode prev = curr.left;
                while (prev.right!=null && prev.right!=curr) {
                    prev=prev.right;
                }

                if(prev.right==null)
                {
                    prev.right =curr;
                    curr=curr.left;
                }
                else
                {
                    prev.right = null;
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        Solution sol = new Solution();

        List<Integer> inorder = sol.getInorder(root);

        System.out.print("Binary Tree Morris Inorder Traversal: ");
        for (int i = 0; i < inorder.size(); i++) {
            System.out.print(inorder.get(i) + " ");
        }
        System.out.println();
    }
}