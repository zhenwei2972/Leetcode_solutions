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
    public boolean isBalanced(TreeNode root) {
        // if helper function returns -1, return false
        // else return true
        
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(checkHeight(root)!= -1) return true;
        else return false; 
    }
    
    public int checkHeight(TreeNode root) {
        // check height of left and right
        // if left and right differ by > 1, return -1
        if(root==null) return 0;
        //base case, when reached leaf node return 1
        if(root.left ==null && root.right == null) return 1;
        //traverse down left and right root which are not null
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);
        //after traversal if base case not reached, we need to do some comparison 
        //on left and right subtree
        //check if height difference is >1
        if(leftHeight ==-1 || rightHeight == -1) return -1;
        else if(Math.abs(leftHeight - rightHeight)>1) return -1;
        else return Math.max(leftHeight,rightHeight)+1;
        
        // return height if condition is okay
    }
}

//        1
//      /   \
//     2     2
//    /     / \
//   3     3   3
//  /  \ 
// 4    4


//     2   
//    /     
//   3   
//  /  \ 
// 4    4