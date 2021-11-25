package trees;

public class Trees {

    public static int findSum(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        // add data of left and right node to root node
        return rootNode.data + findSum(rootNode.left) +
                findSum(rootNode.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(findSum(a));
    }
}
