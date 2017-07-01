public class BinarySearchTree {
	 
	 public Node root;
	 
	 public BinarySearchTree insert(int value) {
	    Node node = new Node<>(value);
	    if (root == null) {
	      root = node;
	      return this;
	    }
	    insertNode(root, node);
	    return this;
	  }
	  
	  public void insertNode(Node Parent, Node node) {
	    if (node.value < Parent.value) { // go to Left sub-tree
	      if (Parent.left == null) {
              Parent.left = node;
          return;
	      } 
	      else {
	        insertNode(Parent.left, node);
	      }
	    } else { // go to Right sub-tree
	      if (Parent.right == null) {
	        Parent.right = node;
	        return;
	      } 
	      else {
	        insertNode(Parent.right, node);
	      }
	    }
	  }
	 
	  public void InorderTraversal() {
	    printInOrder(root);
	    System.out.println("");
	    int Target =45;
	    
	  }
	 
	  private void printInOrder(Node currentRoot) {
	    if (currentRoot == null) {
	      return;
	    }
	    printInOrder(currentRoot.left);
	    System.out.print(currentRoot.value + ", ");
	    printInOrder(currentRoot.right);
	  }
	  
	  public void PreorderTraversal() {
	    printPreOrder(root);
	    System.out.println("");
	  }
	  
      private void printPreOrder(Node currentRoot) {
	    if (currentRoot == null) {
	      return;
	    }
	    System.out.print(currentRoot.value + ", ");
	    printPreOrder(currentRoot.left);
	    printPreOrder(currentRoot.right);
	  }
	 
	  public void PostorderTraversal() {
	    printPostOrder(root);
	    System.out.println("");
	  }
	 
	  private void printPostOrder(Node currentRoot) {
	    if (currentRoot == null) {
	      return;
	    }
	    printPostOrder(currentRoot.left);
	    printPostOrder(currentRoot.right);
	    System.out.print(currentRoot.value + ", ");
	 
	  }
	  
	  public int FindMinElement() {
	    if (root == null) {
	      return 0;
	    }
	    Node currentNode = root;
	    while (currentNode.left != null) {
	      currentNode = currentNode.left;
	    }
	    return currentNode.value;
	  }
	 
	  public int FindMaxElement() {
	    if (root == null) {
	      return 0;
	    }
	    Node currentNode = root;
	    while (currentNode.right != null) {
	      currentNode = currentNode.right;
	    }
	    return currentNode.value;
	  }
	  
	  
	  public void search(int target){
          Node ptr = root;
          Node Parent = null;
        while (ptr != null) {
               
                if (target == ptr.value) {
                        System.out.println("True: value found");
                        System.out.println("");
                        System.out.println("Left Child Value:");
                        System.out.print(ptr.left.value);
                        System.out.println("");
                        System.out.println("Right Child Value:");
                        System.out.print(ptr.right.value);
                        System.out.println("");
                        System.out.println("Node Value:");
                        System.out.print(ptr.value);
                        System.out.println("");
                        System.out.println("parent Value:");
                        System.out.print(root.value);
                        //return ptr.value
                }
                if (target < ptr.value) {
                        ptr = ptr.left;
                } 
                else {
                        ptr = ptr.right;
                }
        }
       // System.out.println("False");
	  	}
	
	  public int getHeight(Node root){
          if(root == null){
                  return -1;
          }
         
          int Lheight = getHeight(root.left);
          int Rheight = getHeight(root.right);
         
          if(Lheight > Rheight){
                  return (Lheight +1);
          }else{
                  return (Rheight + 1);
          }
  }
	  private int nodes(Node T) {   
		  // if it's null, it doesn't exist, return 0 
		  if (T == null) return 0;
		  // count myself + my left child + my right child
		  return 1 + nodes(T.left) + nodes(T.right);
		}
	// Write a method to search a particlar value and print True if it is found. 
	// Also print its parent's, left child's and right child's value. Print null if it does't have a left or child child. 
	// write a method to count the number of nodes.
	// write a method to find the height of a tree.
}