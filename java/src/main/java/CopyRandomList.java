import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        //把旧对象和新的对象放入map
        Map<Node,Node> nodeMap=new HashMap<>();
        Node newNode=makeNextNode(head,nodeMap);
        Node tmpNode=newNode;
        while(tmpNode!=null){
            tmpNode.random=nodeMap.get(head.random);
            head=head.next;
            tmpNode=tmpNode.next;
        }
        return newNode;
    }

    public Node makeNextNode(Node head,Map<Node,Node> nodeMap){
        if(head==null){
            return null;
        }
        Node node=new Node(head.val);
        node.next=makeNextNode(head.next,nodeMap);
        nodeMap.put(head,node);
        return node;
    }
}
