class Assignment9{
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.viewRear();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.viewFront();
    }
}

class Queue{
    int front=-1;
    int rear=-1;
    int size;
    int []ptr;

    Queue(int lenght){
        size = lenght;
        ptr = new int[lenght];
    }

    void enqueue(int value){
        if(isOverFlow()){
            System.out.println("Queue is overflow");
        }
        else{
            if(front == -1){
                front++;
            } 
            rear=rear+1;
            ptr[rear]= value;        
            System.out.println("Enqueue Successfully");
        }
    }

    void viewRear(){
        if(isUnderFlow()){
            System.out.println("Stack is underflow.");
        }
        else{
            System.out.println("Value of Rear is "+ptr[rear]);
        }
    }

    void viewFront(){
        if(isUnderFlow()){
            System.out.println("Queue is underflow.");
        }
        else{
            System.out.println("Value of Front is "+ptr[front]);
        }
    }

    void dequeue(){
        if(isUnderFlow()){
            System.out.println("Queue is underflow ");
        }
        else{
            System.out.println("dequeued is "+ ptr[front]);
            if(front == rear){
                front = -1;
                rear = -1;
            } else{
                front ++;
            }
        }
    }

    boolean isOverFlow(){
        return rear == size-1;
    }
    boolean isUnderFlow(){
        return front == -1;
    }

    void printQueue(){
        for(int i = front; i< rear; i++){
            System.err.print(ptr[i]+" "+ i + " | ");
        }
        System.out.println();
    }
}