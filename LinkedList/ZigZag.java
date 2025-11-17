public class ZigZag {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node findMid(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reversedHead(Node rightHead){
        Node prev = null;
        Node curr = rightHead;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node zigZag(){
        Node midNode = findMid();
        Node rightHead = reversedHead(midNode.next);
        Node leftHead = head;
        midNode.next = null;
        Node nextR, nextL;

        while(leftHead!=null && rightHead!=null){
            nextL = leftHead.next;
            nextR = rightHead.next;
            leftHead.next = rightHead;
            rightHead.next = nextL;
            leftHead = nextL;
            rightHead = nextR;
        }
        return head;
    }

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args){
        ZigZag zg = new ZigZag();
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        zg.printll();
        zg.zigZag();
        zg.printll();
    }
}
