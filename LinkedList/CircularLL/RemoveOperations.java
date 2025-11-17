public class RemoveOperations {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("List is empty!...");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        if(head == tail){
            head = tail = null;
            size--;
            return val;
        }

        head = head.next;
        tail.next = head;
        size--;

        return val;
    }

    // remove middle
    public int removeMiddle(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index!...");
            return Integer.MIN_VALUE;
        }

        if(idx == 0){
            return removeFirst();
        }

        if(idx == size-1){
            return removeLast();
        }

        Node prev = head;
        int i = 0;

        while(i<idx-1){
            prev = prev.next;
            i++;
        }

        Node curr = prev.next;
        int val = curr.data;
        prev.next = curr.next;
        size--;

        return val;
    }

    // remove last
    public int removeLast(){
        if(head == null){
            System.out.println("List is empty!...");
            return Integer.MIN_VALUE;
        }

        if(head == tail){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = head;
        tail = temp;
        size--;
        return val;
    }

    public void printll(){
        if(head == null){
            System.out.println("null");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data+"->");
            temp = temp.next;
        } while(temp!=head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        RemoveOperations r = new RemoveOperations();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        tail = head.next.next.next;
        tail.next = head; 
        size = 4;

        r.printll();
        r.removeFirst();
        r.printll();
        r.removeLast();
        r.printll();
        r.removeMiddle(1);
        r.printll();
    }
}
