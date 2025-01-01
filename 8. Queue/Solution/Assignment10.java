public class Assignment10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.getElements();
        queue.dequeue();
        queue.countElements();
        queue.getElements();
        queue.viewFront();
        queue.viewRear();
    }
}
class Queue{
    Node front = null;
    Node rear = null;

    class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }

        public int getItem(){
            return item;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
    }

    void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        } 
        System.out.println("Enqueue Successful");
    }

    void viewRear(){
        if(isEmpty()){
            System.out.println("Queue is emptry");
        }
        else{
            System.out.println("Queue rear value is "+ rear.getItem());
        }
    }

    void viewFront(){
        if(isEmpty()){
            System.out.println("Queue is emptry");
        }
        else{
            System.out.println("Queue Front value is "+ front.getItem());
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is emptry");
        } else{
            front = front.getNext();
            if (front == null) { //if delete last element
                rear = null;
            }
            System.out.println("Dequeue Successfull");
        }
    }

    boolean isEmpty(){
        return front == null;
    }

    void countElements(){
        Node temp = front;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        System.out.println("count: " + count);
    }

    void getElements(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.getItem()+ " | ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}