public class ReverseDll {
    public static class Node{
        int data;
        Node prev, next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseDll r = new ReverseDll();
        r.printll();
        r.reverse();
        r.printll();
    }
}
