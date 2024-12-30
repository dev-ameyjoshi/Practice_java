package striver;

//Initialization of nodes needed for Doubly linked List.
class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;

    }
}




public class DLinkedList {

    //Method To Print the LinkedList.
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    //Convert an array into a doubly linked List
    private static Node arrayToDLL(int [] t){
        Node head = new Node(t[0]);
        Node prev = head;
          for(int i = 1;i<t.length;i++){
            Node temp = new Node(t[i],null,prev);
            prev.next = temp;
            prev = temp;
            }
          return head;

    }

    //Method to delete head in a doubly linked List.
    private static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        //garbage collector deletes the temp prev value and frees up node.

        return head;
    }

    //Method to delete the tail of the linked List
    private static Node deleteTail(Node head){
        if(head == null || head.next == null) {
            return null;
        }
        Node tail = head;

        while(tail.next != null){
           tail = tail.next;
        }

        Node newTail = tail.back;
        newTail.next = null;
        tail.back= null;

        return head;
    }
    //To Delete the kth element
    public static Node deleteKth(Node head,int k){
        if(head == null) return null;

        //Traversal for particular element renmoval.
        int cnt=0;
        Node ktemp = head;
        while(ktemp != null){
            cnt++;
            if(cnt == k) break;
            ktemp = ktemp.next;
        }
        Node prev = ktemp.back;
        Node front = ktemp.next;

        //cases if it is the only node
        if(prev == null && front == null){
            //garbage collection : temp is freed.
            return null;
        } else if (prev == null) {
            // if it is the head value and there is no node before.
            return  deleteHead(head);
        } else if (front == null) {
            // if it is the last value that has no next node -> tail value hence :
            return deleteTail(head);

        }

        //if it is none of the cases above then :
        prev.next = front;
        front.back = prev;

        ktemp.next = null;
        ktemp.back = null;
        //garbage collection : temp is freed.
        return head;
    }
    //To delete Node
    private static Node deleteNode(Node temp){
        if(temp == null) return null;

        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            prev.next  = null;
            temp.back = null;
            return temp;
        }

        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;
        return temp;
    }
    public static Node insertBeforeHead(Node head,int val){

        Node newHead = new Node(val,head,null);
        head.back = newHead;
        return newHead;

    }
    public static Node insertBeforeTail(Node head,int val){
        if(head.next == null){
            return insertBeforeHead(head,val);
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node prev = tail.back;
        Node newNode = new Node(val,tail,prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }
    //Insert before the kth element :
    public static Node insertBeforeKth(Node head,int k, int val){
        if(k == 1){
            return  insertBeforeHead(head,val);
        }
        Node temp = head;
        int count = 0;
        while(temp!= null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return  head;
    }
    public static Node insertBeforeNode(Node node,int val){
        Node prev= node.back;
        Node newNode = new Node(val,node,prev);
        prev.next = newNode;
        node.back = newNode;
        return node;
    }

     
    public static void main(String[] args) {
        int []t = {12,5,6,8};
        Node head = arrayToDLL(t);

        //head = deleteHead(head);

        //head = deleteTail(head);
        //head = deleteKth(head , 4);
        //deleteNode(head.next.next.next);
        //head = insertBeforeHead(head,10);

        //head = insertBeforeTail(head,10);
        //head = insertBeforeKth(head,4,10);
        insertBeforeNode(head.next.next,100);
        print(head);
    }
}
