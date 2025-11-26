import java.util.*;

class UsingFramework{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(0);
        s.push(-1);
        s.push(-2);

        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}