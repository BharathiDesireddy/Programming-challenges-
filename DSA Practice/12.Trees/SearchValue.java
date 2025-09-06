public class SearchValue {
    
    public static boolean searchValue(Node root, int target){
        while(root!=null){

            if(root.data==target){
                return true;
            }

            root=(target<root.data)?root.left:root.right;
        }

        return false;
    }
}
