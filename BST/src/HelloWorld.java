
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinarySearchTree BST = new BinarySearchTree();
		    BST.insert(50);
		    BST.insert(25);
		    BST.insert(75);
		    BST.insert(80);
		    BST.insert(20);
		    BST.insert(35);
		    BST.insert(15);
		    BST.insert(40);
		    BST.insert(45);
		    BST.insert(80);
		    BST.insert(85);
		    BST.insert(90);
		    System.out.println("Inorder traversal");
		    BST.InorderTraversal();
		    System.out.println("Preorder Traversal");
		    BST.PreorderTraversal();
		    System.out.println("Postorder Traversal");
		    BST.PostorderTraversal();
		    System.out.println("The minimum value in the BST: " + BST.FindMinElement());
		    System.out.println("The maximum value in the BST: " + BST.FindMaxElement());
		    BST.search(50);
		    BST.getHeight();
		  }


}
