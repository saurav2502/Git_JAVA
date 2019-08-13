package JAVA_APP.Stack;

public class StackImpl {
    private int top = -1;
    private int size;
    private int [] stackArr;

    public StackImpl(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    public void push(int n){
        top ++;
        stackArr[top] = n;
        System.out.println("pushed element is: "+n);
    }

    public int pop(){
        int n = stackArr[top];
        top--;
        System.out.println("poped out element is "+n);
        return n;
    }

    public boolean isEmpty(){
        if ( top == -1 ){
            return true;
        }else
            return false;
    }

    public boolean isfull(){
        if ( top == stackArr.length - 1 ){
            return true;
        }else
            return false;
    }

    public int topEle(){
        return stackArr[top];
    }

    public int bottomEle(){
        return stackArr[0];
    }
}
