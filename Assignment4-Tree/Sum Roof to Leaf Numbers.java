class Solution {
    static int sum=0;
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
    public int solve(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        if(root.right==null && root.left==null){
            return sum*10+root.val;
        }
        int newsum=sum*10+root.val;
        return solve(root.left,newsum)+solve(root.right,newsum);
}
}
