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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null ^ q ==null) return false;
       if(p==null && q == null) return true;
       
        // use stack for DFS search 
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(p);
        Stack<TreeNode> s2 = new Stack<>();
        s2.push(q);
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            TreeNode s1Val = s1.pop();
            TreeNode s2Val = s2.pop();
            if(s1Val.val != s2Val.val) return false;
            if(s1Val.left ==null^ s2Val.left==null ) return false;
            if(s1Val.right==null ^ s2Val.right ==null) return false;
            
            if(s1Val.left !=null) s1.push(s1Val.left);
            if(s1Val.right !=null) s1.push(s1Val.right);
            if(s2Val.left !=null) s2.push(s2Val.left);
            if(s2Val.right !=null) s2.push(s2Val.right);
            
        }
        return true;
    }
}