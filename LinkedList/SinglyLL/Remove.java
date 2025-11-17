// Find & Remove Nth Node from end of a linked list

public class Remove {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int findSize(){
        Node temp = head;
        int sz = 0;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        return sz;
    }

    public void removeNode(int n){
        int sz = findSize();

        if (n == sz){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=0; i<sz-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Remove ll = new Remove();
        int n = 2;
        ll.removeNode(n);
    }
}
