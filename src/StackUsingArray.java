public class StackUsingArray {
        int MAX_SIZE = 10;
        int index ;
        int[] stackArray;
    
        public StackUsingArray() {
            index = -1;
            stackArray = new int[MAX_SIZE];
        }
    
                public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element.");
            } else {
                stackArray[++index] = value;
                System.out.println(value + " pushed to the stack.");
            }
        }
    
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; 
            } else {
                int poppedValue = stackArray[index--];
                System.out.println(poppedValue + " popped from the stack.");
                return poppedValue;
            }
        }
    
        public boolean isEmpty() {
            return index == -1;
        }
    
        public void print() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                System.out.print("Stack: ");
                for (int i = 0; i <= index; i++) {
                    System.out.println(stackArray[i] + " ");
                }
                System.out.println();
            }
        }
    
        public int peak() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot get peak element.");
                return -1; 
            } else {
                return stackArray[index];
            }
        }
    
        public boolean isFull() {
            return index == MAX_SIZE - 1;
        }
    
    
}
