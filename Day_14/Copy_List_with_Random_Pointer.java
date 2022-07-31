/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
HashMap<Node, Node> visitedNode = new HashMap<Node, Node>();
 return copyRandomListHelper(head,visitedNode);   

}

public Node copyRandomListHelper(Node head,Map visitedNode){
    if(head==null)
    {
        return null;
    }
    if(visitedNode.containsKey(head))
    {
        return (Node)visitedNode.get(head);
    }
    
    Node node= new Node(head.val,null,null);
    
    visitedNode.put(head,node);
    
    node.next=copyRandomListHelper(head.next,visitedNode);
    node.random=copyRandomListHelper(head.random,visitedNode);
    
    return node;
} 
}