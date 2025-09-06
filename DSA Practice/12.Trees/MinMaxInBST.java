public class MinMaxInBST {
    public static int findMin(Node node){

        if(node==null){
            throw new IllegalArgumentException("Tree is empty");
        }

        while(node.left!=null){
            node=node.left;
        }

        return node.data;
    }

    public static int findMax(Node node){

        if(node==null){
            throw new IllegalArgumentException("Tree is empty.....");
        }

        while (node.right!=null){

            node=node.right;
        }

        return node.data;
    }
}
