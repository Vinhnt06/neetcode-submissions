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
        if(root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        int depth = 0;
        q.add(root);
        while(!q.isEmpty()){
        int size = q.size();
         depth++;

        for(int i = 0 ; i < size ; i++)
        {
           TreeNode t = q.poll();
            if(t.right !=null) q.add(t.right);
            if(t.left !=null) q.add(t.left);
        }
         
    }
        return depth;
    }
}

