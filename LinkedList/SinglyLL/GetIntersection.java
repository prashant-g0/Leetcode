public class GetIntersection {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node headA;
    public static Node headB;

    public Node intersectPoint(Node headA, Node headB){
        Node ptrA = headA;
        Node ptrB = headB;

        if(ptrA==null || ptrB==null){
            return null;
        }

        while(ptrA!=ptrB){
            ptrA = (ptrA!=null)? ptrA.next:headB;
            ptrB = (ptrB!=null)? ptrB.next:headA;
        }

        return ptrA;
    }

    public static void main(String[] args) {
        GetIntersection it = new GetIntersection();

        headA = new Node(10);
        headA.next = new Node(15);
        headA.next.next = new Node(30);

        headB = new Node(3);
        headB.next = new Node(6);
        headB.next.next = new Node(9);
      
        headB.next.next.next = headA.next;

        Node interPt = it.intersectPoint(headA, headB);

        if (interPt == null)
            System.out.println("-1");
        else
            System.out.println(interPt.data);
    }
}
