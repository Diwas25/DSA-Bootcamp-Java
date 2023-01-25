package Easy;

import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (mainStack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}


public class MinStackMain {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        minStack.push(15);
        minStack.push(30);
        System.out.println("The minimum element in the stack is: " + minStack.getMin()); // should print 5
        minStack.pop();
        minStack.pop();
        System.out.println("The minimum element in the stack is: " + minStack.getMin()); // should print 10
        System.out.println("The top element in the stack is: " + minStack.top()); // should print 15
    }
}
