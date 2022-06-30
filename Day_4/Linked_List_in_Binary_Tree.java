class Solution {
    List<TreeNode> storeElement=new ArrayList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        storeToList(head,root);
        for(TreeNode ele:storeElement){
            if(checkSubPath(head,ele)) return true;
        }
        return false;
    }
    public void storeToList(ListNode head,TreeNode root){
        if(head==null || root==null) return;
        if(head.val==root.val) storeElement.add(root);
        storeToList(head,root.left);
        storeToList(head,root.right);
    }
    public boolean checkSubPath(ListNode head,TreeNode node){
        if(head==null) return true;
        if(node==null) return false;
        if(head.val==node.val){
            return checkSubPath(head.next,node.left) || checkSubPath(head.next,node.right);
        }
        return false;
    }
}