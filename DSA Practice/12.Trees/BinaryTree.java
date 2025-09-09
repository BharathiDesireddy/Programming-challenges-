import java.util.*;

//import org.w3c.dom.Node;



class BinaryTree{
    public BinaryTree(){

    }

    private Node root;
    
    public void populate(Scanner s){
        System.out.println("Enter root node:");
        int value=s.nextInt();
        root=new Node(value);
        populate(s,root);
    }

    private void populate(Scanner s, Node node){
        System.out.println("Do you want to enter left of the node:"+node.data);
        boolean left=s.nextBoolean();

        if(left){
            System.out.println("Enter the left value of the node:"+node.data);
            int value=s.nextInt();
            node.left=new Node(value);
            populate(s,node.left);
        }

        System.out.println("Do you want to enter right of the node:"+node.data);
        boolean right=s.nextBoolean();
        
        if(right){
            System.out.println("Enter the left value of the node:"+node.data);
            int value=s.nextInt();
            node.right=new Node(value);
            populate(s,node.right);
        }        
    }

    public void display(){
        display(this.root," ");
    }

    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.data);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void treeDisplay(){
        treeDisplay(root,0);
    }

    private void treeDisplay(Node node, int level){
        if(node==null){
            return;
        }
        treeDisplay(node.right,level+1);

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----------->"+node.data);
        }
        else{
            System.out.println(node.data);
        }

        treeDisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /*BinaryTree tree1 = new BinaryTree();
        tree1.populate(s);
        tree1.display();
        tree1.treeDisplay();

        */


        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;

        // Insert elements
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            root = tree.insert(root, val);
        }

        //tree.treeDisplay();
        tree.inOrder(root);

        //size of the tree
        System.out.println("\n\nSize of the Binary Search Tree : "+tree.size(root));

        //height of the tree

        System.out.println("Height of the tree : "+tree.height(root));

        System.out.println("\nIs 12 Found : "+SearchValue.searchValue(root,12));

        System.out.println("Minimum Value :"+MinMaxInBST.findMin(root));

        System.out.println("Maximum Value :"+MinMaxInBST.findMax(root));

        //deleting cases..
        root = tree.deleteNode(root, 20); // Case 1: leaf node
        System.out.print("After deleting 20: ");
        tree.inOrder(root);
        System.out.println();

        root = tree.deleteNode(root, 30); // Case 2: one child
        System.out.print("After deleting 30: ");
        tree.inOrder(root);
        System.out.println();

        root = tree.deleteNode(root, 50); // Case 3: two children
        System.out.print("After deleting 50: ");
        tree.inOrder(root);
        System.out.println();

        
    
    }
}