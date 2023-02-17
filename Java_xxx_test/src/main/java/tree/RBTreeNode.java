package tree;

public class RBTreeNode extends TreeNode<Integer> {

    public TreeNode parent;
    public RBTreeNode(Integer data) {
        super(data);
    }
    public RBTreeNode(Integer data,TreeNode left,TreeNode right){
        super(data,left,right);
    }
    public RBTreeNode(Integer data,TreeNode parent) {
        super(data);
        this.parent=parent;
    }
    public RBTreeNode(Integer data,TreeNode parent,TreeNode left,TreeNode right) {
        super(data,left,right);
        this.parent=parent;
    }
}
