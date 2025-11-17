public class Basics {
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
    public static int size;

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // addLast

    // removeFirst

    // removeLast


    public void printll(){
        Node forward = head;
        System.out.print("Forward List: ");
        while(forward!=null){
            System.out.print(forward.data+"<->");
            forward = forward.next;
        }
        System.out.println("null");

        Node backward = tail;
        System.out.print("Backward List: ");
        while(backward!=null){
            System.out.print(backward.data+"<->");
            backward = backward.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Basics b = new Basics();
        b.addFirst(1);
        b.addFirst(2);
        b.addFirst(3);
        b.printll();
    }
}
