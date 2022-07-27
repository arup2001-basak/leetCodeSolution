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
    public void flatten(TreeNode root) {
    TreeNode cur = root;
    while (cur != null)
    {  
        if (cur.left != null)
        {
            // if we need to prune a right subtree
            if (cur.right != null)
            {
                TreeNode next = cur.left;
                while (next.right != null)
                    next = next.right;
                next.right = cur.right;
            }
            cur.right = cur.left;
            cur.left = null;
        }  
        cur = cur.right;
    }
}
}