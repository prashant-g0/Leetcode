public class RemoveCycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public boolean removeCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        if (slow!=fast) return false;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        Node prev = slow;
        while(prev.next!=slow){
            prev = prev.next;
        }
        prev.next = null;

        return true;
    }

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveCycle rc = new RemoveCycle();
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // rc.printll(); // goes in infinite loop because of cycle in linked list
        rc.removeCycle();
        rc.printll();
    }
}
