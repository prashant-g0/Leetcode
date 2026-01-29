// Problem Statement:
//Given the roots of two binary trees root and subroot, 
// return true if there is a subtree of root with the same structure
// and node values of subroot and false otherwise

//          1              2
//         /\             /\
//        2  3           4 5
//       /\   \
//      4  5   6

public class Subtree {
    
    static class Node {
        int data;
        Node left, right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        public static Node buildTree(int nodes[], int[] idx) {
            idx[0]++;
            if(nodes[idx[0]] == -1) return null;

            Node newNode = new Node(nodes[idx[0]]);
            newNode.left = buildTree(nodes, idx);
            newNode.right = buildTree(nodes, idx);

            return newNode;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null) return true;

        else if (node == null || subRoot == null || node.data != subRoot.data) return false;
        if(!isIdentical(node.left, subRoot.left)) return false;
        if(!isIdentical(node.right, subRoot.right)) return false;

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) return false;

        if (root.data == subRoot.data){
            if(isIdentical(root, subRoot)) return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int tree[] = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        int subtree[] = {2, 3, -1, -1, 4, -1, -1};
        BinaryTree BT = new BinaryTree();
        int [] idx1 = {-1};
        Node tree_root = BT.buildTree(tree, idx1);
        int [] idx2 = {-1};
        Node subtree_root = BT.buildTree(subtree, idx2);

        System.out.println(isSubtree(tree_root, subtree_root));
    }
}

