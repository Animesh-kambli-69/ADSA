class Node{
    //Defining node structure
    int data;
    Node left , right;

    public Node(int item){
        data = item;
        left = right = null;
    }

}

public class BST{

    Node root;

    BST(){
        root = null;
    }
    
    //Create a newNode and insert 
    Node insert(Node root , int value){
        //If tree is empty create new Node
        if(root == null){
            root = new Node(value);
            return root;
        }

        //If not then come down to tree
        if(value >  root.data){
            root.right = insert(root.right , value);
        }else{
            root.left = insert(root.left , value);
        }
        return root;
    }
    
    //inorder traversl (left , root , right)
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }

    //preorder traversal (root , left , right)
    void preOrder(Node root){
        if(root!=null){
            System.out.println(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //postOrder traversal (left , right , root)
    void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data +" ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        //inserting value 
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);

        System.out.println("InOrder traversal");
        tree.inOrder(tree.root);

        System.out.println("PreOrder traversal");
        tree.preOrder(tree.root);

        System.out.println("PostOrder traversal");
        tree.postOrder(tree.root);;

    }
}