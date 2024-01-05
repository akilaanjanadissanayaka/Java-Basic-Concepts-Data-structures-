package AdvanceDataStructures;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert a key into the BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Delete a key from the BST
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children
            root.key = minValue(root.right);

            // Delete the in-order successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Find the node with the minimum key value in a BST
    public int minValue() {
        return minValue(root);
    }

    private int minValue(TreeNode root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Find the node with the maximum key value in a BST
    public int findMax() {
        return findMax(root);
    }

    private int findMax(TreeNode root) {
        if (root == null) {
            // Handle the case where the tree is empty
            System.out.println("Tree is empty.");
            return Integer.MIN_VALUE;
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.key;
    }

    // Print Inorder traversal of the BST
    public void printInorder() {
        System.out.print("Inorder Traversal: ");
        printInorder(root);
        System.out.println();
    }

    private void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.key + " ");
            printInorder(root.right);
        }
    }

    // Print Preorder traversal of the BST
    public void printPreorder() {
        System.out.print("Preorder Traversal: ");
        printPreorder(root);
        System.out.println();
    }

    private void printPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // Print Postorder traversal of the BST
    public void printPostorder() {
        System.out.print("Postorder Traversal: ");
        printPostorder(root);
        System.out.println();
    }

    private void printPostorder(TreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Searching for a key
    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}
