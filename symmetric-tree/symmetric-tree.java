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
    public boolean isSymmetric(TreeNode root) {
        //use a queue to solve this, by traversing down the tree and checking for mirrored nodes.
        //base case // null case
        if(root.left == null && root.right == null) return true;
        //if either are null, means already not mirrored.
        if(root.left ==null ^ root.right == null) return false;
        //begin traversal code, in the case that there are nodes that need value checking to check for mirror-ed property
        //initialize queue.
        Queue<TreeNode> leftQ = new LinkedList<TreeNode>();
        Queue<TreeNode> rightQ = new LinkedList<TreeNode>();
        //initialize queues with first 2 nodes
        leftQ.add(root.left);
        rightQ.add(root.right);
        
        //iteriate through all nodes, checking values , left node first then right nodes. 
        while(!leftQ.isEmpty() && !rightQ.isEmpty())
        {
            //check left nodes first
            TreeNode tempLeft=leftQ.poll();
            TreeNode tempRight = rightQ.poll();
           
            if(tempLeft.val != tempRight.val) return false;
            //null check for outer most elements
            if(tempLeft.left ==null ^ tempRight.right == null) return false;
            else if(tempLeft.left !=null)
            {
                leftQ.add(tempLeft.left);
                rightQ.add(tempRight.right);
            }
            //null check for inner most element
            if(tempLeft.right == null ^ tempRight.left == null) return false;
            else if( tempLeft.right !=null)
            {
                leftQ.add(tempLeft.right);
                rightQ.add(tempRight.left);
            }
        }
        return true;
    }
}