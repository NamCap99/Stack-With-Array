package StackWithArray;

public class Main {
    public static void main (String[] args){
        StackWithArray stack = new StackWithArray(5);
        System.out.println("Stack empty or not: "+stack.isEmpty());
        System.out.println("Stack is full or not: "+stack.isFull());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("The stack is: ");
        stack.printStack();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        System.out.println("The stack is: ");
        stack.printStack();
        System.out.println("The size of stack is: " + stack.size());
        stack.delete();
        System.out.println("The size of stack is: " + stack.size());
    }
}

