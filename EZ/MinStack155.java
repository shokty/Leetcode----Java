package EZ;

import java.util.LinkedList;
import java.util.Stack;
public class MinStack155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        minStack.getMin(); // return -1
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }
}
class MinStack {
    Stack<minNode> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }
    public void push(int x) {
        stack.add(new minNode(x,stack.isEmpty() ? Integer.MAX_VALUE : stack.peek().min));
    }
    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}

class minNode{
    public int val;
    public int min;
    public minNode(int val,int min){
        this.val = val;
        this.min = Math.min(min,val);
    }
}
