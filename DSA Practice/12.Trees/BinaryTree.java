import java.util.*;

class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

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
        System.out.println("Do you want to enter left of the node:"+node.value);
        boolean left=s.nextBoolean();

        if(left){
            System.out.println("Enter the left value of the node:"+node.value);
            int value=s.nextInt();
            node.left=new Node(value);
            populate(s,node.left);
        }

        System.out.println("Do you want to enter right of the node:"+node.value);
        boolean right=s.nextBoolean();
        
        if(right){
            System.out.println("Enter the left value of the node:"+node.value);
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
        System.out.println(indent+node.value);
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
            System.out.println("|----------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }

        treeDisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(s);
        tree.display();
        tree.treeDisplay();
    }
}