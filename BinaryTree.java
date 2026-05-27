import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTreeImpl {
    Node root;

    void insert(int d) {
        Node nn = new Node(d);

        if (root == null) {
            root = nn;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = nn;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = nn;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }

    void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    void leftView() {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.poll();
                if(i==0)
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    void rightView() {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int s = q.size();
            for(int i=0;i<s;i++){
                Node temp = q.poll();
                if(i==s)
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {

        BinaryTreeImpl tree = new BinaryTreeImpl();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Level Order Traversal:");
        tree.levelOrder();
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        tree.leftView();
        System.out.println();
        tree.rightView();
        System.out.println();
    }
}