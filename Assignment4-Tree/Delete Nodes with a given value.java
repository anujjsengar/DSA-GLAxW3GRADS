class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        remove(root,target,root);
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }
        return root;
    }
    public void remove(TreeNode root,int target,TreeNode prev){
        if(root==null){
            return ;
        }
        remove(root.left,target,root);
        remove(root.right,target,root);
        if(root.val==target){
            if(prev.right==root && root.left==null && root.right==null){
                prev.right=null;
                return ;
            }
            if(prev.left==root && root.right==null && root.left==null){
                prev.left=null;
                return ;
            }
        }
    }
}
