import java.util.Iterator;
import java.util.Stack;
import java.util.LinkedList;

public class PalindromeLL {

    public static boolean isPalindrome(LinkedList<Character> list){
        Stack<Character> s = new Stack<>();

        Iterator<Character> temp = list.iterator();
        while(temp.hasNext()){
            s.push(temp.next());
        }

        temp = list.iterator();
        while(temp.hasNext()){
            char val = temp.next();
            if(s.peek() == val){
                s.pop();
            } else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.addFirst('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('B');

        System.out.println(isPalindrome(list));
    }
}
