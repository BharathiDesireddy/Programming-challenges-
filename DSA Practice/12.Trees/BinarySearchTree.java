

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

class BinarySearchTree{
    Node root;

    public void insert(int data){
        root=insertRec(root,data);
    }

    public Node insertRec(Node node,int data){

        if (node==null){
            node=new Node(data);
        }

        else if (data<node.data){
            node.left=insertRec(node.left,data);
        }

        else if (data>node.data){
            node.right=insertRec(node.right,data);
        }

        return node;
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

    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Node node){
        if (node!=null){
            inOrderRec(node.left);
            System.out.print(node.data+"  ");
            inOrderRec(node.right);
        }
    }


    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.treeDisplay();
        tree.inOrder();
    }
}