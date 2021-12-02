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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        //int depth =0;
        if(root.left == null && root.right == null) return 1;
        
        return Math.max(maxDepth(root.left) ,maxDepth(root.right))+1;
        
    }
}

//     3
//    / \
//   3   3
//  / \
// 3   3
//    /
//   3

// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root==null) return 0;
//         int depth = 0;
      
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);
//         while(!queue.isEmpty())
//         {
           
//             int qSize = queue.size();
//             for(int i =0; i<qSize; i++)
//             {
//                 TreeNode currNode =queue.poll();
//                 if(currNode.left !=null) queue.add(currNode.left);
//                 if(currNode.right !=null) queue.add(currNode.right);
                
//             }
//             depth++;
//         }
//         return depth;
//     }
// }