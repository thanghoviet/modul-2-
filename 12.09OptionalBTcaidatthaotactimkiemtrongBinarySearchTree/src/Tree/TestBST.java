package Tree;

public class TestBST<E> {
    public static void main(String[] args) {
        //create a BST
        SearchTree<String> tree = new SearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder: ");
        tree.inorderTraversal();
        System.out.println("The number of nodes is: " + tree.getSize());
        tree.printTree();
        System.out.println("Searching Adam: " + tree.contains("Adam"));
        System.out.println("Searching Adam1: " + tree.contains("Adam1"));
    }
}
