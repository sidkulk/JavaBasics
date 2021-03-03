import java.util.Scanner;

class Node {
    Node right, left;
    int data;

    Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}

abstract class TreeMeth {
    abstract void addNode(Node root, int data);

    abstract void inOrder(Node root);

    abstract void preOrder(Node root);

    abstract void postOrder(Node root);

    abstract void searchNode(Node root);
}

class Main extends TreeMeth {
    Node root;
    static Scanner sc;
    final String exceptStr = "Yet to be implemented";

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        sc.close();
    }

    @Override
    void addNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            root.left = null;
            root.right = null;
        } else {
            // TODO Implement the recursive algorithm
            // for tree traversal
        }
    }

    @Override
    void inOrder(Node root) {
        throw new IllegalStateException(exceptStr);
    }

    @Override
    void preOrder(Node root) {
        throw new IllegalStateException(exceptStr);
    }

    @Override
    void postOrder(Node root) {
        throw new IllegalStateException(exceptStr);
    }

    @Override
    void searchNode(Node root) {
        throw new IllegalStateException(exceptStr);
    }

}