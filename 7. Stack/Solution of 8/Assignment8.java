public class Assignment8 {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();
        stack.popTopValue();
        stack.printStack();
        stack.peekTopValue();

    }
}
class Stack{
    Node top = null;
    class Node{
        int item;
        Node next;

        public int getItem() {
            return item;
        }
        public void setItem(int item) {
            this.item = item;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    void push(int item){
        Node node = new Node();
        node.setItem(item);
        node.setNext(null);

        if(top == null){
            top = node;
        } else {
            Node temp = top;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        System.out.println("Pushed successfully");
    }

    void peekTopValue(){
        if(top ==null){
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            System.out.println("Value of Top element is = "+ temp.getItem());
        }
    }

    void popTopValue(){
        if(top ==null){
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(null);
            System.out.println("Poped successfully");
        }
    }

    void reverse(){
        if(top == null){
            System.out.println("Stack is empty");
        } else {
            //remaining work of reverse stack
        }
    }

    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.getItem() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }
}