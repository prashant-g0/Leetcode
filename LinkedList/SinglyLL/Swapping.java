public class Swapping {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node swapping(Node head, int k){
        Node first = head, second = head, curr = head;

        for(int i=1; i<k; i++){
            curr = curr.next;
        }
        first = curr;

        while(curr.next!=null){
            curr = curr.next;
            second = second.next;
        }

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return head;
    }

    public void printll(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Swapping s = new Swapping();
        int k = 1;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        s.printll(head);
        head = s.swapping(head, k);
        s.printll(head);
    }
}
