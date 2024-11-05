
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JUNAID COMPUTER
 */
public class Binary_Tree {
    class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    }
     Node root;

    // Constructor
    public Binary_Tree() {
        this.root = null;
    }
 public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            insertRec(root, newNode);
        }
    }

    // Recursive helper method for insertion
    private void insertRec(Node current, Node newNode) {
        if (newNode.value < current.value) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertRec(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertRec(current.right, newNode);
            }
        }
    }
 public int countNodes() {
        return countNodesRec(root);
    }

    // Recursive helper method for counting nodes
    private int countNodesRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRec(node.left) + countNodesRec(node.right);
    }
 public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
 public void preOrderTraversal() {
        preOrderTraversalRec(root);
    }

    // Recursive helper method for pre-order traversal
    private void preOrderTraversalRec(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversalRec(node.left);
        preOrderTraversalRec(node.right);
    }
 public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    // Recursive helper method for in-order traversal
    private void inOrderTraversalRec(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversalRec(node.left);
        System.out.print(node.value + " ");
        inOrderTraversalRec(node.right);
    }

    // Post-order Traversal
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
    }

    // Recursive helper method for post-order traversal
    private void postOrderTraversalRec(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversalRec(node.left);
        postOrderTraversalRec(node.right);
        System.out.print(node.value + " ");
    }
}


