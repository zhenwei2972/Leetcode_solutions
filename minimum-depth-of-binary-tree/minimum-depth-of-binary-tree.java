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
    public int minDepth(TreeNode root) {
        // BFS traversal..
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0;
        if(root== null) return depth;
        while(!queue.isEmpty())
        {
            int count = queue.size();
            //need to use for loop to increment depth at a per level basis
            depth++;
            for(int i =0; i <count; i++)
            {
                TreeNode currNode =queue.poll();
                if(currNode.left == null && currNode.right == null) return depth;
                
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right !=null) queue.add(currNode.right);
            }
            
        }
        return depth;
    }
}