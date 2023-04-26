public class BSTlinkedList {
    TreeNode root;
    class TreeNode
    {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val)
        {
            this.val=val;
            this.left=this.right=null;
        }
    }
    void InsertNode(int val)
    {
        TreeNode newnode=new TreeNode(val);
        if(root==null)
        {
            root=newnode;
        }
        else
        {
            TreeNode parent=null;
            TreeNode current=root;
            while (true) {
                parent=current;
             if(current.val>val)
             {
                 current=current.left;
                 if(current==null)
                 {
                     parent.left=newnode;
                     return;
                 }
             }
             else
             {
                 current=current.right;
                 if(current==null)
                 {
                     parent.right=newnode;
                     return;
                 }

             }
            }

        }

    }
    void preorder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);

    }


}

class mannu
{
    public static void main(String[] args) {
        BSTlinkedList l=new BSTlinkedList();
        l.InsertNode(13);
        l.InsertNode(14);
        l.InsertNode(77);
        l.InsertNode(1);
        l.InsertNode(3);
        l.preorder(l.root);
    }
}
