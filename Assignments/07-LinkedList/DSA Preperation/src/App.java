public class App {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public  void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(head == null){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        
        public void printlist(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        
        public void printSize(){
            Node current = head;
            int size = 0;
            while(current != null){
                size+=1;
                current = current.next;
            }
            System.out.println(size);
        }
        
        public void removeNode(int val){
            Node current = head;
            Node prev = null;
            if(head.data == val){
                head = current.next;
                current = null;
            }
            else{
                while(current.data != val){
                    prev = current;
                    current = current.next;
                }
                prev.next = current.next;
                current.next = null;
            }
        }
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        
        // Adding the elements to the last
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        
        // Printing the linked list 
        ll.printlist();
        // Printing the size of list
        ll.printSize();

        // Removing a node from linkedlist
        ll.removeNode(10);
        ll.printlist();
        
    }
}
