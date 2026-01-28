public class Diameter {
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
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int ht = Math.max(lh, rh) + 1;

        return ht;
    }

    public static int diameter(Node root){
        if (root == null) return 0;

        int ld = diameter(root.left);
        int lHt = height(root.left);
        int rd = diameter(root.right);
        int rHt = height(root.right);

        int self_dia = lHt + rHt + 1;

        return Math.max(Math.max(ld, rd), self_dia);
    }
    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}
