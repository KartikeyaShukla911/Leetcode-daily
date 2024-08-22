/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] description) {
        int n = description.length;

        HashMap<Integer,TreeNode> hm = new HashMap();
        Set<Integer> hasChildset = new HashSet();

        int i;
        for(i=0;i<n;i++)
        {
            if(!hm.containsKey(description[i][0]))
                hm.put(description[i][0],new TreeNode(description[i][0]));
            
            if(!hm.containsKey(description[i][1]))
                hm.put(description[i][1],new TreeNode(description[i][1]));
            
           
                hasChildset.add(description[i][1]);
        }

        TreeNode root = null;

        for(i=0;i<n;i++)
        {
            if(description[i][2]==1)
            {
                hm.get(description[i][0]).left = hm.get(description[i][1]);
            }
            else
                hm.get(description[i][0]).right = hm.get(description[i][1]);
            
            if(!hasChildset.contains(description[i][0]))
                root = hm.get(description[i][0]);
        }
        return root;
    }
}