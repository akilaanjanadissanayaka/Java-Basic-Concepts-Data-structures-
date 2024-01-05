package AdvanceDataStructures;

public class main {
    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting keys
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Deleting a key
        bst.delete(20);

        // Finding min and max
        System.out.println("Minimum value in BST: " + bst.minValue());
        System.out.println("Maximum value in BST: " + bst.findMax());

        // Printing traversals
        bst.printInorder();
        bst.printPreorder();
        bst.printPostorder();

        // Searching for a key
        int searchKey = 60;
        System.out.println("Is " + searchKey + " present in the BST? " + bst.search(searchKey));

    }
}
