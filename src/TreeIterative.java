import java.util.*;

public class TreeIterative {
     node root;
     TreeIterative()
     {
         root=null;
     }
    private class node
    {
        node right;
        node left;
        int val;
        node(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    void addroot(int val)
    {
        node temp=new node(val);
        if(root==null)
        {
            root=temp;
        }
    }
    void addNode(int val)
    {
        node temp=new node(val);
        if(root==null)
        {
            root=temp;
        }
        else {

            node current = root;
            node parent = null;

            while (true) {
                parent = current;
                if (parent.val <val) {
                    current = current.right;

                    if (current == null) {
                        parent.right = temp;
                        return;
                    }
                } else {
                    if (parent.val > val) {
                        current = current.left;

                        if (current == null) {
                            parent.left = temp;
                            return;
                        }

                    }
                }
            }
        }

    }
 void data()
 {
     System.out.println(root.val);
     System.out.println(root.right.val);
     System.out.println(root.left.val);
 }
    void preorder(node n)
    {
        Stack<node> stk=new Stack<>();
        while(n!=null||!stk.isEmpty()) {
            if (n != null) {
                System.out.println(n.val);
                stk.push(n);
                n = n.left;
            } else {
                n = stk.pop();
                n = n.right;
            }
        }

    }
    void  levelordertraversal()
    {
        Queue<node> t=new ArrayDeque<>();
        t.offer(root);
        while(!t.isEmpty())
        {
            for (int i=t.size();i>0;i--)
            {
                node temp=t.poll();
                System.out.print(temp.val+" ");
                if(temp.left!=null)
                {
                    t.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    t.offer(temp.right);
                }
            }
            System.out.println("\n");
        }

    }



}
class treemain
{
    public static void main(String[] args) {
        TreeIterative t=new TreeIterative();
        t.addNode(6);
        t.addNode(13);
        t.addNode(1);
        t.addNode(3);
        t.addNode(78);
        t.addNode(16);
        t.levelordertraversal();
        t.data();
    }
}