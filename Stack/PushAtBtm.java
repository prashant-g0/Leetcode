import java.util.Stack;

public class PushAtBtm {

    public static void pushAtBtm(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBtm(s, data);
        s.push(top);
    }

    public static void printStk(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        pushAtBtm(s, 4);
        printStk(s);
    }
}
