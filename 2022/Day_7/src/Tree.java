public class Tree {

    private Node root;

    public Tree(int max){
        root = buildTree(1, max);
    }

    private Node buildTree(int n, int max){
        if (n > max){
            return null;
        }else{
            Node left = buildTree(2 * n, max);
            Node right = buildTree(2 * n + 1, max);
            return new Node(n, left, right);
        }

    }

    public void printPreorder(){
        printPreorder(root);
    }

    private void printPreorder(Node root){
        if(root != null){
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
}
