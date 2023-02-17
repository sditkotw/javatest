package tree;

import base_data_structure.Queue;

//二叉树的各种遍历方式
public class BinaryTree<T> {
    protected TreeNode<T> root;
    protected int length=0;

    public BinaryTree(TreeNode<T> root){
        this.root=root;
        length++;
    }
    //各种遍历方法

    //前序遍历
    public void prePrint(){prePrint(this.root);}
    public void prePrint(TreeNode root){
        if(root==null)return;

        System.out.print(root.getData()+",");
        prePrint(root.left);
        prePrint(root.right);
    }

    //中序遍历
    public void midPrint(){midPrint(this.root);}
    public void midPrint(TreeNode root){
        if(root==null)return;

        midPrint(root.left);
        System.out.print(root.getData()+",");
        midPrint(root.right);
    }

    //后序遍历
    public void postPrint(){postPrint(this.root);}
    public void postPrint(TreeNode root){
        if(root==null)return;

        postPrint(root.left);
        postPrint(root.right);
        System.out.print(root.getData()+",");
    }

    //层次遍历
    public void stepPrint(){
        Queue<TreeNode> queue=new Queue(TreeNode.class,10);
        queue.push(this.root);
        while (queue.getSize()>0){
            TreeNode t=queue.pop();
            System.out.print(t.getData()+",");
            if(t.left!=null){
                queue.push(t.left);
            }
            if(t.right!=null){
                queue.push(t.right);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode D = new TreeNode('D', null, null);
        TreeNode H = new TreeNode('H', null, null);
        TreeNode K = new TreeNode('K', null, null);
        TreeNode C = new TreeNode('C', D, null);
        TreeNode G = new TreeNode('G', H, K);
        TreeNode B = new TreeNode('B', null, C);
        TreeNode F = new TreeNode('F', G, null);
        TreeNode E = new TreeNode('E', null, F);
        TreeNode A = new TreeNode('A', B, E);

        BinaryTree bTree=new BinaryTree(A);
        bTree.stepPrint();
        System.out.println();

        bTree.prePrint();
        System.out.println();

        bTree.midPrint();
        System.out.println();

        bTree.postPrint();
    }
}
