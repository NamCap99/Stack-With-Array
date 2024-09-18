package StackWithArray;

public class StackWithArray {
    private int top;
    private int[] stack;
    public StackWithArray(int size) {
        this.stack = new int[size];
        this.top = -1;
        System.out.println("Stack created with size of: "+size);
    }
    public void push(int value) {
        if(top == stack.length-1) {
            System.out.println("Stack is full");
        }
        else{
//            stack[top+1] = value;
//            top++;
//            we can use this, increment first, then add the value
            stack[++top] = value;
            System.out.println("Stack pushed: "+value);
        }
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
//            int topStack = stack[top];
//            top--;
//            decrement top after retrieving the value
            int topStack = stack[top--];
            System.out.println("Stack popped value: "+topStack);
            return topStack;
        }
    }
    public int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            System.out.println("Stack peeked: "+stack[top]);
            return stack[top];
        }
    }

    public int size() {
        return top+1;
    }

    // Method to delete the stack
    public void delete() {
        stack = null;  // Set the stack array to null
        top = -1;      // Reset the top pointer to -1, indicating an empty stack
        System.out.println("Stack deleted and reset");
    }
    public boolean isEmpty() {
//        if(top == -1){
//            return true;
//        }
//        return false;
        return top == -1;
    }
    public boolean isFull() {
//        if(top == stack.length-1){
//            return true;
//        }
//        return false;
        return top == stack.length-1;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i=top; i>=0; i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}
