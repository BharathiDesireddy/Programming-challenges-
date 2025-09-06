


class BinarySearchTree{
    Node root;

    

    public Node insert(Node node,int data){

        if (node==null){
            node=new Node(data);
        }

        else if (data<node.data){
            node.left=insert(node.left,data);
        }

        else if (data>node.data){
            node.right=insert(node.right,data);
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

   

    public void inOrder(Node node){
        if (node!=null){
            inOrder(node.left);
            System.out.print(node.data+"  ");
            inOrder(node.right);
        }
    }

    public static Node findMin(Node node){

        if(node==null){
            return null;
        }
        while(node.right!=null){
            node=node.right;
        }

        return node;
    }


    //Deleting Node in Binary search tree

    public Node deleteNode(Node node, int key){

        if(node==null){
            return null;
        }

        if (key<node.data){
            node.left=deleteNode(node.left,key);
        }

        else if (key>node.data){
            node.right=deleteNode(node.right,key);
        }

        else{

            //case : 1 - no child
            if (node.left==null && node.right==null){
                return null;
            }

            //case - 2 : one child

            else if (node.left==null){
                return node.right;
            }

            else if (node.right==null){
                return node.left;
            }

            //case 3 : twp child...

            Node successor= findMin(node.right);

            node.data=successor.data;

            node.right = deleteNode(node.right,successor.data);
        }

        return node;
    }


   
        
}