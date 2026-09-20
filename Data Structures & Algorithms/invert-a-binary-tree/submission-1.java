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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode res = root;
        TreeNode tmp = null;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            
            if(node.left != null)
                q.offer(node.left);
            
            if(node.right != null)
                q.offer(node.right);
        }
        //System.out.println(node.left.val);
        //System.out.println(node.right.val);
        
        return res;
    }
}
