import java.util.*;

public class binarytress {

    static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{

        //we need to travel ek ek sequence
        static int idx=-1;//we will increment it to the length
        //this will return the root nodes
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)//if some node is -1 basically no left right child
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);//whatever node comes out we'll store it in left
            newNode.right=buildTree(nodes);

            return newNode;

        }

    }

    public static void preorder(Node root){
        //base case
        if(root==null){
            return;//when no right left child
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");



    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();//created a queue
        q.add(root);//added the root node first only
        q.add(null);
        //loop till queue is empty
        while(!q.isEmpty()){
            Node currNode=q.remove();
            //if currNode is null

            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                //checking left chid and right child
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);

                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }



    }

    public static int countofnodes(Node root){
        if(root==null){
            return 0;
        }

        int leftnodes=countofnodes(root.left);
        int rightnodes=countofnodes(root.right);

        return leftnodes+rightnodes+1;
    }

    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }

        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);

        return leftsum+rightsum+root.data;


    }
    //
    public static int heightoftree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=heightoftree(root.left);
        int rightheight=heightoftree(root.right);

        int myheight=Math.max(leftheight, rightheight) +1;

        return myheight;
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();//creating a tree through the class
        Node root =tree.buildTree(nodes);//we'll the root by calling this function 
        //System.out.println(root.data);
        //preorder(root);
        //inorder(root);
        levelOrder(root);
    }

    
    
}
