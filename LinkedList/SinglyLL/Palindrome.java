public class Palindrome{
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

    public Node findMid(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null) return true;

        // Step1: find mid node
        Node midNode = findMid(head);
        // Step2: initialize the values
        Node prev = null;
        Node curr = midNode;
        Node next;
        // Step3: reverse the 2nd half
        while(curr!=null){
            next = curr.next; // define 
            curr.next = prev; // reverse

            // update
            prev = curr;
            curr = next;
        }

        // Step4: check for palindrome
        Node right = prev; // head of right half (2nd half)
        Node left = head; //head of left half (1st half)

        while(right != null){
            if(right.data != left.data) return false;
            left = left.next;
            right = right.next;
        }
        return true; 
    }

    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        pl.checkPalindrome();
    }

}