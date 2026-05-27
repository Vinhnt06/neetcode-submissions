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
      int cal =   caculate(root);
        if(cal <= -1) return false;
        return true;
    }
    private int caculate(TreeNode root) {
    if (root == null) return 0;

    // Bước 1: Tính chiều cao nhánh trái
    int lh = caculate(root.left);
    if(lh == -1) return -1;
  

    int rh = caculate(root.right);
    if (rh == -1) return -1;

    if (Math.abs(lh - rh) > 1) return -1;

    return 1+ Math.max(lh,rh);
    
}
}
