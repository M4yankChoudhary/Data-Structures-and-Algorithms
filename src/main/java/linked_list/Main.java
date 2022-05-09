package linked_list;

public class Main {
    public static int countNodes(Node head) {
       int count = 1;
       String nodes = String.valueOf(head.data);
       Node current = head;
       while (current.next != null){
           current = current.next;
            nodes += "-> "+ current.data;
           count++;
       }
       System.out.println("Linked List: "+ nodes);
       return count;
    }
    public static void main(String[] args) {
        // create nodes
        Node head  = new Node(4);
        Node nodeB  = new Node(5);
        Node nodeC  = new Node(6);
        Node nodeD  = new Node(7);

        // connect nodes
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println("Node Count: "+ countNodes(head));
    }


}
