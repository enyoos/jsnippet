public class DoubleLinkedList<V>{
    
    public class Node<V>{
        public Node previous;
        public Node next;
        public V item;
        public Node (V item){this.item=item;}
    }

    private int size = 0;
    Node head = null, tail = null; //soit la tete et la queue
    public boolean addLast(V item){
        this.size++;
        Node<V> node = new Node<>(item);
        if (this.head == null){
           this.head=this.tail=node; 
           this.head.previous=null;
           this.tail.next=null;
        }else {
            tail.next=node;
            node.previous=tail;
            tail=node;
            tail.next=null;
        }
        return true;
    }
    public void add(int index, V element){
        this.size++;
        Node<V> node = new Node<>(element);
        Node<V> temp= head, prev = null;
        int counter = 0;
        while (temp != null){
            if (counter == index){
                prev.next = node;
                node.next=temp;
            }
        }
    }
    public boolean addFirst(V item){
        this.size++;
        Node<V> node = new Node<>(item);
        node.next=head.next;
        node.previous=head.previous;
        node=head;
        return true;
    }
    
    public int getSize(){return this.size;} 

    public void clear(){
        Node<V> temp = head;
        while (temp != null){
            temp = temp.next;
            temp.previous=null;
        }
        this.size=0;
    }

    public void printDl(){
        Node<V> temp = head;
        while (temp != null){
            System.out.print(temp.item);
            temp = temp.next;
            System.out.print("->");
        } 
    }
}