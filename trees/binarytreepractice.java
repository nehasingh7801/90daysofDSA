public class binarytreepractice {

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
        static int idx=-1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
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
        System.out.println(root.data+" ");
        inorder(root.right);
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

        int leftnodes=sumofnodes(root.left);
        int rightnodes=sumofnodes(root.right);

        return leftnodes+rightnodes+1;
    }

    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        preorder(root);
    }
}