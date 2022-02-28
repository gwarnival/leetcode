class MyLinkedList {
    class Node {
        Node prev;
        Node next;
        int val;
        Node(int val){
            this.next = null;
            this.prev = null;
            this.val = val;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index >= this.size){
            return -1;
        }
        Node t = this.head;
        for(int i = 0; i < index; i++){
            t = t.next;
        }
        return t.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        else{
            this.tail = newNode;
        }
        this.head = newNode;
        this.size++;
        
    }
    
    public void addAtTail(int val) {
        Node newTail = new Node(val);
        if(this.tail == null){
            this.head = newTail;
        }
        else{
            this.tail.next = newTail;
            newTail.prev = this.tail;
        }
        this.tail = newTail;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
        }
        else if(index == this.size){
            addAtTail(val);
        }
        else if(index > this.size){
            return;
        }
        else{
            Node cur = this.head;
            int i = 1;
            while(i < index){
                cur = cur.next;
                i++;
            }
            Node temp = cur.next;
            Node newNode = new Node(val);
            
            newNode.prev = cur;
            newNode.next = temp;
            
            cur.next = newNode;
            temp.prev = newNode;
            this.size++;
        }    
    }
    
    public void deleteAtIndex(int index) {
        if(index >= this.size){
            return;
        }
        if(index == 0){
            if(this.head.next == null){
                this.head = null;
                this.tail = null;
            }
            else{
                Node newHead = this.head.next;
                newHead.prev = null;
                this.head.next = null;
                this.head = newHead;
            }
        }
        else if(index == this.size - 1){
            int i = 1;
            Node cur = this.head;
            while(i < index){
                cur = cur.next;
                i++;
            }
            cur.next.prev = null;
            cur.next = null;
            this.tail = cur;
        }
        else{
            int i = 1;
            Node cur = this.head;
            while(i < index){
                cur = cur.next;
                i++;
            }
            Node toRemove = cur.next;
            
            cur.next = toRemove.next;
            cur.next.prev = cur;
            toRemove.next = null;
            toRemove.prev = null;
        }
        this.size--;
        
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */