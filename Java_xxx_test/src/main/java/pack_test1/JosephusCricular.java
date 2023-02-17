package pack_test1;

public class JosephusCricular {


    public static void main(String[] args) {
        CLinkList list=new CLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.print();
        //System.out.println(list.getNode(5,5).value);
        int start=0;
        int step=5;
        for(int i=list.getSize();i>1;i--){
            start=list.getIndexStep(start,step);
            list.deleteNode(start);
            list.print();
            System.out.println("size:"+list.getSize());
        }
    }
}

class CLinkList{
    private Node head;//有数的头下标
    private Node tail;//有数的尾下标
    private int size;
    public CLinkList(){
        head=null;
        tail=null;
        size=0;
    }
    public int getSize(){
        return this.size;
    }

    public Node get(int pos){
        Node cur=head;
        if(pos<size){
            for(int i=0;i<pos;i++){
                cur=cur.next;
            }
        }
        return cur;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(size==0){
            this.tail=this.head=newNode;
            tail.next=head;
        }else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public int getIndexStep(int start,int step){
        return (start-1+step)%size;
    }
    public Node getNode(int start,int step){
        return get(getIndexStep(start,step));
    }
    public void addNode(int pos,int data){
        int rp=pos%size;
        Node newNode=new Node(data);
        if(rp==0){
            newNode.next = head;
            tail.next = newNode;
            head=newNode;
        }else if(rp==size-1) {
            add(data);
        }else {
            Node cur=get(rp-1);
            newNode.next=cur.next;
            cur.next=newNode;
        }
        size++;
    }

    public void deleteNode(int pos){
        int rp=pos%size;
        if(rp==0){
            tail.next=head.next;
            head=head.next;
        }else if(rp==size-1) {
           tail=get(size-2);
           tail.next=head;
        }else {
            Node cur=get(rp-1);
            cur.next=cur.next.next;
        }
        size--;
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(get(i).value+", ");
        }
        System.out.println();
    }
}

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
}
