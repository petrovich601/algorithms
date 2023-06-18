public class Linlist {
    public Node head;

    // [1, ..] -> [2]
    // [1] -> [2]
    // 1
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }
    
    public void print(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }


    public class Node{
        int value;
        Node next;
    }
    


    public void revert(){
        if (head != null && head.next != null){
            revert(head.next, head);
        }
    }
    
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null){
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    
}
