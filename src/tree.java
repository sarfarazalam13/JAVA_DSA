import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class tree {
    TreeNode root;
    class TreeNode
    {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val)
        {
            this.val =val;
            this.left=null;
            this.right=null;
        }
    }
    void addrootNode(int val)
    {
        TreeNode node=new TreeNode(val);
        if(root==null)
        {
            root=node;
        }
        else
            System.out.println("root node alredy present pass 2 parameters");
    }
    void addnode(int val,char c)
    {
        TreeNode node=new TreeNode(val);
        TreeNode parent=root;
        if(c=='l')
        {
            parent.left=node;
            return;
        }
        if(c=='r')
        {
            parent.right=node;
            return;
        }

    }

    void addbinarynode(int val)
    {
        TreeNode newnode=new TreeNode(val);
        TreeNode parent=null;
        TreeNode current=root;
        while(true)
        {
            parent=current;
            if(val>parent.val)
            {
                current=current.right;
                if(current==null)
                {
                    parent.right=newnode;
                    return;
                }
            }
            else
            {
                current=current.left;
                if(current==null)
                {
                    parent.left=newnode;
                    return;
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
    void inorder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);

    }

    void levelorder(TreeNode root)
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>(Arrays.asList(root));


        while(!q.isEmpty())
        {
            ArrayList<Integer> level=new ArrayList<>();
            for (int i=0;i<q.size();i++)
            {
                TreeNode temp=q.poll();
                level.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }

            }
            arr.add(level);
        }
        System.out.println(arr);
    }



}

class Mnai
{
    public static void main(String[] args) {
        tree t=new tree();
        t.addrootNode(13);
        /*t.addnode(10,'l');
        t.addnode(11,'r');
        t.addnode(1,'l');
        t.addnode(2,'r')*/;
        //t.preorder(t.root);
        t.addbinarynode(10);
        t.addbinarynode(14);
        t.addbinarynode(15);
        t.addbinarynode(17);
        t.addbinarynode(19);
        t.preorder(t.root);
        System.out.print("\n");
        t.inorder(t.root);
        t.levelorder(t.root);
    }
}
