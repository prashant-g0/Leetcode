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
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(size == 0){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // removeFirst
    public void removeFirst(){
        if(size == 0){
            System.out.println("List is empty!...");
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // removeLast
    public void removeLast(){
        if(size == 0){
            System.out.println("List is empty!...");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }


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
        b.addLast(4);
        b.printll();
        System.out.println("Size: "+size);

        b.removeFirst();
        b.printll();
        System.out.println("Size: "+size);

        b.removeLast();
        b.printll();
        System.out.println("Size: "+size);
    }
}
