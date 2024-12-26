public class Assignment7 {
    public static void main(String[] args){
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.peekTopValue();
        s.pop();
        s.peekTopValue();

    }
}
class Stack{
    int top = -1;
    int size;
    int []ptr ;

    Stack(int size){
        this.size = size;
        ptr = new int[size];
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full !");
        } else{
            top++;
            ptr[top]= value;
            System.out.println("Value is pushed successfully");
        }
    }

    public void peekTopValue(){
        if(isEmpty()){
            System.out.println("Stack is Empty !");
        } else{
            System.out.println("Value of top element is "+ptr[top]);
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty ! cannot pop");
            return -1;
        }
        else{
            System.out.println("Value poped successfully");
            return ptr[top--];
        }
    }

    boolean isEmpty(){
        return top == -1; //return true or false
    }

    boolean isFull(){
        return top == size-1;
    }
}
