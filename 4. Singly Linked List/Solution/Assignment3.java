//Incomplete Assignment

class Assignment3 {
    public static void main(String[] args) {
        SLL linkedlist = new SLL();
        linkedlist.insertNode(10);
        linkedlist.insertNode(20);
        linkedlist.insertNode(30);
        linkedlist.insertNode(40);
        linkedlist.insertNode(50);
        linkedlist.insertNode(60);
        linkedlist.insertNode(70);
        linkedlist.insertNode(80);
        linkedlist.insertNode(90);
        
        linkedlist.printLinkedListData();
    }
}

class SLL {
    class Node {
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

    Node start = null;

    // check linked list is empty
    boolean isEmpty() {
        return start == null;
    }

    // add node beginning of the list
    void insertNode(int item) {
        Node node = new Node();
        node.setItem(item);
        node.setNext(start);
        start = node;
    }

    // insert node at the last of the linked list
    void insertNodeLast(int item) {
        Node node = new Node();
        node.setItem(item);
        node.setNext(null);
        if (start == null) {
            start = node;
        } else {
            Node temp = start;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    // search node of given item value
    Node searchNode(int item) {
        Node temp = start;
        while (temp != null) {
            if (temp.getItem() == item) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    // insert node after given node
    void insertNodeAfter(Node n, int item) {
        Node node = new Node();
        node.setItem(item);
        node.setNext(n.getNext());
        n.setNext(node);
    }

    // delete first node
    void deleteFirstNode() {
        if (start == null) {
            System.out.println("Linked list is Empty");
        } else {
            start = start.getNext();
        }
    }

    // delete last node from linked list
    void deleteLastNode() {
        if (start == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node temp = start;
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
    }

    //
    void deleteNode(int item) {
        if (start == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node n = searchNode(item);
            if (n != null) {
                if (start == n) { 
                    deleteFirstNode();
                } else {
                    Node temp = start;
                    while (temp.getNext() != n) { 
                        temp = temp.getNext();
                    }
                    temp.setNext(n.getNext());
                }
            } else {
                System.out.println("Node with value " + item + " not found.");
            }
        }
    }
    //print all items in the list
    void printLinkedListData(){
        Node temp = start;
        while(temp != null){
            System.out.println(temp.getItem());
            temp = temp.getNext();
        } 
    }
}