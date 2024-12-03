//Incomplete Assignment

class Assignment3{
    public static void main(String[] args){
        Node node1 = new Node(10);
        System.out.println(node1.data);
        System.out.println(node1.next);
    }
}
class Node {
    int data;  
    Node next; 
    Node(int data) {
        this.data = data;
        this.next = null; 
    }
}