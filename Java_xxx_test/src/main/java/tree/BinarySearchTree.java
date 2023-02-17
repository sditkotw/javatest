package tree;


//二叉树排序树的增删改查
public class BinarySearchTree extends BinaryTree<Integer>{


    public BinarySearchTree(TreeNode<Integer> root) {
        super(root);
    }

    public boolean search(TreeNode<Integer> root,int data){
        if(data<root.getData()){
            if(root.left==null){
                return false;
            }else {
                //遍历
                return search(root.left,data);
            }
        }else if (root.getData()<data){
            if(root.right==null){
                return false;
            }else {
                //遍历
                return search(root.right,data);
            }
        }else {
            return true;
        }
    }

    public void add(TreeNode<Integer> root,int data){
        if(data<root.getData()){
            if(root.left==null){
                RBTreeNode nt=new RBTreeNode(data,root.left);
                root.left=nt;
            }else {
                //遍历
                add(root.left,data);
            }
        }else{
            if(root.right==null){
                RBTreeNode nt=new RBTreeNode(data,root.right);
                root.right=nt;
            }else {
                //遍历
                add(root.right,data);
            }
        }
    }

    public void delete(RBTreeNode root){
        //叶子节点直接删除
        if(root.left==null&&root.right==null){
            if(root!=this.root) {
                if(root.parent.right==root){
                    root.parent.right=null;
                }

                if(root.parent.left==root){
                    root.parent.left=null;
                }
            }else {
                this.root=null;
            }
        }//左右节点都有，右节点替代被删节点，左节点成为被删节点后继节点的左节点
        else if(root.left!=null&&root.right!=null){
            if(root!=this.root) {
                if (root.parent.right == root) {
                    root.parent.right = root.right;
                }
                if (root.parent.left == root) {
                    root.parent.left = root.right;
                }
            }else {
                this.root=root.right;
            }
            searchPostNode(root.right).left=root.left;

            root.right=null;
            root.left=null;
        }//左右节点只有一个,删除后它的左/右节点成为它父节点的左右节点
        else{
            if(root.right!=null){
                if(root!=this.root) {
                    if(root.parent.right==root){
                        root.parent.right=root.right;
                    }

                    if(root.parent.left==root){
                        root.parent.left=root.right;
                    }
                }else {
                    this.root=root.right;
                }
                root.right=null;
            }

            if(root.left!=null){
                if(root!=this.root) {
                    if(root.parent.right==root){
                        root.parent.right=root.left;
                    }

                    if(root.parent.left==root){
                        root.parent.left=root.left;
                    }
                }else {
                    this.root=root.left;
                }

                root.left=null;
            }
        }
    }

    public TreeNode searchPostNode(TreeNode treeNode){
        if(treeNode.left==null)
            return treeNode;
        else
            return searchPostNode(treeNode.left);
    }

    public static void main(String[] args) {
        RBTreeNode D = new RBTreeNode(2, null, null);
        RBTreeNode H = new RBTreeNode(6, null, null);
        RBTreeNode K = new RBTreeNode(8, null, null);
        RBTreeNode C = new RBTreeNode(3, D, null);
        RBTreeNode G = new RBTreeNode(7, H, K);
        RBTreeNode F = new RBTreeNode(9, G, null);
        RBTreeNode B = new RBTreeNode(1, null, C);
        RBTreeNode E = new RBTreeNode(5, null, F);
        RBTreeNode A = new RBTreeNode(4,null, B, E);
        B.parent=A;
        E.parent=A;
        F.parent=E;
        G.parent=F;
        H.parent=G;
        K.parent=G;
        C.parent=B;
        D.parent=C;


        BinarySearchTree bTree=new BinarySearchTree(A);
        bTree.midPrint();
        System.out.println(bTree.search(A,10));

        bTree.add(A,10);
        bTree.midPrint();
        System.out.println(bTree.search(A,10));

        bTree.delete(G);
        bTree.midPrint();
    }

}
