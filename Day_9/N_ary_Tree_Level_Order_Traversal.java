/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node node) {
        List<List<Integer>> res=new ArrayList<>();
        if(node==null) return res;
        Queue<Node> q=new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()){
            List<Integer> levelNode=new ArrayList<>();
            int count=q.size();
            while(count>0){
                Node curr=q.remove();
                levelNode.add(curr.val);
                for(Node child:curr.children) q.add(child);
                count--;
            }
            if(levelNode.size()>0) res.add(levelNode);
        }
        return res;
    }
}