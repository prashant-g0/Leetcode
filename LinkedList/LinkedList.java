public class LinkedList{
    public class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // add first O(1) - a newNode before the node1 [head->node1->node2->tail] ---> [head->node0->node1->node2->tail]

        // Step1: Create a new node
        Node newNode = new Node(data);

        // if newNode is the ultimate new node
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2: Link to the head node
        newNode.next = head;
        // Step3: the newNode is now the head node
        head = newNode;
    }

    public void addLast(int data){
        // add last O(1) - a newNode after the current last node [head->node1->node2->tail] ---> [head->node1->node2->node3->tail]

        // Step1: Create a new node
        Node newNode = new Node(data);

        // if newNode is the ultimate new node
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2: link the newNode to current last node
        tail.next = newNode;
        // Step3: the newNode is now the tail node
        tail = newNode;
    }

    public void printLL(){ //O(n)
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        // Step1: Create temporary (temp) node and assign to the head node
        Node temp = head;

        // Step2: print data and move to next node until null is reached
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printLL();
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();

        // output: 3->2->1->4->5->6
    }
}

