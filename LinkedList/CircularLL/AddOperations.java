public class AddOperations {
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

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // addMiddle
    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        if(head == null){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
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
        AddOperations o = new AddOperations();
        o.addFirst(1);
        o.addLast(2);
        o.addLast(3);
        o.addMiddle(1, 99);
        o.printll();
    }
}
