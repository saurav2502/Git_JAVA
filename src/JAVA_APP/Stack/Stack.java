package JAVA_APP.Stack;

public class Stack {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);
        if ( !stack.isfull() ){
            stack.push(1);

        }
        if ( !stack.isfull() ){
            stack.push(2);

        }
        if ( !stack.isfull() ){
            stack.push(3);

        }
        if ( !stack.isfull() ){
            stack.push(4);

        }
        if ( !stack.isfull() ){
            stack.push(5);
        }
        else
            System.out.println("stack is full now");
        if ( !stack.isEmpty() ){
            stack.pop();
        }
        if ( !stack.isEmpty() ){
            stack.pop();
        }
        if ( !stack.isEmpty() ){
            stack.pop();
        }
        if ( !stack.isEmpty() ){
            stack.pop();
        }

        else
            System.out.println("no more element to pop");

        System.out.println(stack.bottomEle());
        System.out.println(stack.topEle());
        stack.topEle();
    }
}
