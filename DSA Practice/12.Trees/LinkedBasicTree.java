class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class LinkedBasicTree{
    Node root;
    public LinkedBinaryTree(int data){
        root=null;
    }
    
    public void sampleTree(){
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(60);
    }

    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.println(node.data+" ");
            inOrder(node.right);
        }
    }
}