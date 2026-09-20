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
        int res=1;
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root,1));
        
        while(!q.isEmpty()){
            Pair tmp = q.poll();
            if(res < tmp.depth)
                ++res;
            
            if(tmp.node.left != null)
                q.offer(new Pair(tmp.node.left,res+1));

            if(tmp.node.right != null)
                q.offer(new Pair(tmp.node.right,res+1));    

        }

        return res;

    }

    //excluding encapsulation for simplicity
    class Pair{
        TreeNode node;
        int depth;
        
        public Pair(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
}
