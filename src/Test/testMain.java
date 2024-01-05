package Test;

public class testMain {
    public static void main(String args[]){
        BST tree=new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder();
//        tree.preOrder();
//        tree.postOrder();

//        System.out.println("min - "+tree.findMin());
//        System.out.println("max - "+tree.findMax());


        tree.delete(50);
        tree.inOrder();


    }
}
