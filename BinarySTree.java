class BinarySearchTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    Node delete(Node root, int key){
        if(root==null){
            return null;
        }
        if(key<root.data){
            root.left = delete(root.left,key);
        }
        else if(key>root.data){
            root.right = delete(root.right,key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.left;
            }
            if(root.right==null){
                return root.right;
            }
            int min = findMin(root.right);
            root.data = min;
            root.right = delete(root.right,min);
        }
        return root;
    }

    int findMin(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class BinarySTree {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);

        tree.inorder(tree.root);
    }
}