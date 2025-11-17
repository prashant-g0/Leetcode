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
    public static int size; // O(1), if loop is used then size will take O(n) time

    public void addFirst(int data){
        // add first O(1) - a newNode before the node1 [head->node1->node2->tail] ---> [head->node0->node1->node2->tail]

        // Step1: Create a new node
        Node newNode = new Node(data);
        size++;

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

    public void addMiddle(int idx, int data){
        if(idx == 0){
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

    public void addLast(int data){
        // add last O(1) - a newNode after the current last node [head->node1->node2->tail] ---> [head->node1->node2->node3->tail]

        // Step1: Create a new node
        Node newNode = new Node(data);
        size++;

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

    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next; 
        // we shifted the head to the next node 
        // and the current node (previously pointed by head) will get deleted by garbage collector 
        // because there's exactly no way to track back to that node, 
        // it useless and hence deleted by java inbuilt garbage collector.

        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int iterativeSearch(int val){ // O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == val){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int val){
        if(head == null){
            return -1;
        } else if(head.data == val){
            return 0;
        }
        int idx = helper(head.next, val);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
 
    public int recursiveSearch(int key){ // O(n)
        return helper(head, key);
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
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printLL();

        ll.addMiddle(0, 7);

        ll.removeLast();

        ll.printLL();
        System.out.println("Value found at index: " + ll.iterativeSearch(4));
        System.out.println("Value found at index: " + ll.recursiveSearch(14));
        System.out.println("Size of the LL: " + size);
    }
}

