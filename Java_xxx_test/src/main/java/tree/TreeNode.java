package tree;

public class TreeNode<T> {
    private T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public TreeNode(T data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public T getData(){
        return this.data;
    }
}
