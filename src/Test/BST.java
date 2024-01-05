package Test;

class Node{
    int key;
    Node left,right;

    public Node(int key) {
        this.key = key;
        left=right=null;
    }
}
public class BST {
    Node root;
    BST(){
        root=null;
    }

    public void insert(int key){
        root=insertKey(root,key);
    }

    private Node insertKey(Node root, int key) {
        if(root==null){
            root=new Node(key);
            return root;
        }
        else if (root.key>key) {
            root.left=insertKey(root.left,key);
        }
        else if (root.key<key) {
            root.right=insertKey(root.right,key);
        }
        return root;
    }

    public void inOrder(){
        System.out.print("Inorder Traversal: ");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node root) {
        if(root!=null){
            printInOrder(root.left);
            System.out.print(root.key+" ");
            printInOrder(root.right);
        }
    }
    public void preOrder(){
        System.out.print("Preorder Traversal: ");
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(Node root) {
        if(root!=null){
            System.out.print(root.key+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
    public void postOrder(){
        System.out.print("Postorder Traversal: ");
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(Node root) {
        if(root!=null){
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.key+" ");
        }
    }

    public int findMin(){
        return findMinValue(root);
    }

    private int findMinValue(Node root) {
        int minVal=root.key;
        while (root.left!=null){
            minVal=root.left.key;
            root=root.left;
        }
        return minVal;
    }

    public int findMax(){
        return findMaxValue(root);
    }

    private int findMaxValue(Node root) {
        int maxVal=root.key;
        while (root.right!=null){
            maxVal=root.right.key;
            root=root.right;
        }
        return maxVal;
    }

    public void delete(int key){
        root=deleteValue(root,key);
    }

    private Node deleteValue(Node root, int key) {
        if(root==null){
            return root;
        }
        if (root.key>key){
            root.left=deleteValue(root.left,key);
        }
        else if (root.key<key){
            root.right=deleteValue(root.right,key);
        }
        else {
            if (root.left==null){
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }

            else {
                root.key=findMinValue(root.right);

                root.right=deleteValue(root.right,root.key);
            }
        }
        return root;
    }

}
