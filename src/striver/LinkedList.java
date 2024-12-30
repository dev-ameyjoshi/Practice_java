//package striver;
//
//
//class Node{
//    int data;
//    Node next;
//    Node(int data, Node next){
//        this.data = data;
//        this.next = next;
//    }
//    Node(int data1){
//        this.data = data1;
//        this.next = null;
//    }
//};
//
////Converting Array to a linked List - O(n)
//public class LinkedList {
//    private static Node arrayToLinkedList(int [] arr ){
//        Node head = new Node(arr[0]);
//        Node mover = head;
//        for(int i = 1;i<arr.length;i++){
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//            mover = temp;
//        }
//        return head;
//    }
//
//    //Search in a linkedlist
//    private static int check(Node head,int val){
//        Node temp = head;
//        while(temp != null){
//            if(temp.data == val) return 1;
//            temp = temp.next;
//        }
//        return  0;
//    }
//
//    //Print the count of the linked List
//    private static int lengthOfLL(Node head) {
//        int count = 0;
//        Node temp = head;
//        while (temp != null) {
//        // System.out.print(temp.data + " ");
//            temp = temp.next;
//            count++;
//        }
//        return count;
//    }
//    // System.out.print(head.data);
//    private static void print(Node head){
//        while(head != null){
//            System.out.println(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    //Deletion Methods : remove head ,tail,position and value
//    //Method to remove head of the element in a linked List.
//    public static Node removeHead(Node head){
//        //edge case :
//        if(head == null){
//            return head;
//        }
//        head = head.next;
//        return head;
//    }
//
//    //Delete the tail node by checking that at least there are 2 nodes present in the LL.
//    public static Node deleteTail(Node head){
//        if(head == null || head.next == null) return null;
//        Node temp = head;
//        while(temp.next.next != null){
//            temp = temp.next;
//        }
//        temp.next = null;
//        return head;
//    }
//
//    //To delete particular element k in LL.TC : 0(k)
//    public static Node deleteK(Node head,int k){
//        if(head == null)return head;
//        //base cases if head or k is null or 1 respectively.
//        if(k == 1){
//            Node temp = head;
//            head = head.next;
//            return head;
//        }
//
//        int count = 0;
//        Node temp = head;
//        Node prev = null;
//        while(temp != null){
//            count++;
//            if(count == k){
//               prev.next = prev.next.next;
//               break;
//            }
//            prev = temp;
//            temp= temp.next;
//        }
//        return head;
//    }
//
//    //Method to delete element data as per input using data as input.
//    public static Node deleteEl(Node head,int el){
//        if(head == null)return head;
//        //base cases if head or k is null or 1 respectively.
//        if(head.data == el ){
//            Node temp = head;
//            head = head.next;
//            return head;
//        }
//
//
//        Node temp = head;
//        Node prev = null;
//        while(temp != null){
//            if(temp.data == el){
//                prev.next = prev.next.next;
//                break;
//            }
//            prev = temp;
//            temp= temp.next;
//        }
//        return head;
//    }
//
//    /*
//    * Insertion Methods :
//    * 1)Inserting Head.
//    * 2)Inserting Tail.
//    * 3)Inserting at kth position.
//    * 4)Insertion before a certain value.
//    *  */
//
//
//    //1)Inserting Head.
//    public static Node insertNode(Node head,int val){
//          //Node temp = new Node(val,head);
//          return new Node(val,head);
//    }
//
//    //Inserting Tail
//    public static Node insertTail(Node head,int val){
//        //base case
//        if(head == null){
//          return new Node(val);
//        }
//        //To reach till the last element so that we can find null element.
//        Node temp = head;
//        while(temp.next !=null){
//            temp = temp.next;
//        }
//        //To create the new Node to be inserted at the end and join it to the prev Node.
//        Node newNode = new Node(val);
//        //to point to this particularly to this new node.
//        temp.next = newNode;
//        return head;
//    }
//    //3)Inserting at the kth element : k = 1 to N+1
//    public static Node insertKth(Node head,int el,int k){
//        //To cover the base cases : if no element is present.
//        if(head == null){
//            if(k == 1){
//                return new Node(el);
//            }else{
//                return head;
//            }
//        }
//         //if only one element is present
//        if(k == 1){
//            return new Node(el,head);
//        }
//        //Flag method to keep a tab on current element number.
//        int count = 0;
//        Node temp = head;
//        //while the temp values are still present.
//        while(temp!=null){
//            count++;
//            if(count == k-1){ //if the count is equal to the last element -1.
//                /*
//                (below line) elements next is pointing to temps next that is the value that is to be inserted at the kth position
//                so we would have ti make the link first in
//                order to connect the temp value later and then complete the LL accordingly.
//                */
//
//                Node x = new Node(el,temp.next);
//                temp.next = x;
//                break;
//            }
//            temp = temp.next;
//        }
//        return head;
//    }
//    //4)Insertion before a certain value.
//    public static Node insertBeforeVal(Node head,int el,int val){
//        //To cover the base cases : if no element is present.
//        if(head == null){
//           return null;
//        }
//        //if only one element is present
//        if(head.data == val){
//            return new Node(el,head);
//        }
//        //Flag method to keep a tab on current element number.
//
//        Node temp = head;
//        //while the temp values are still present.
//        while(temp.next!=null){
//            if(temp.next.data == val){ //if the count is equal to the last element -1.
//                Node x = new Node(el,temp.next);
//                temp.next = x;
//                break;
//            }
//            temp = temp.next;
//        }
//        return head;
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,5,6,8};
//        Node head = arrayToLinkedList(arr);
//
//        /*
//        Simple Linked List
//        Node y = new Node(arr[3]);
//        System.out.println(y.data);
//        */
//
//
//        /*
//        Calling for method arrayToLinkedList
//        To print all the elements of the linked List
//                Node temp = head;
//                while(temp != null){
//                   System.out.print(temp.data + " ");
//                    temp = temp.next;
//                }
//
//         */
//
//        //System.out.print(lengthOfLL(head) + " ");
//
//        //System.out.println(check(head,12));
//
//        //head = removeHead(head);
//
//        //System.out.print(head);
//
//        //print(head);
//
//        //head = deleteTail(head);
//        //print(head);
//
//        //head = deleteK(head,4);
//
//        //head = deleteEl(head,5);
//
//        //head = insertNode(head,100);
//
//        //head = insertTail(head,100);
//        //head = insertKth(head,14,2);
//
//        head = insertBeforeVal(head,22,6);
//        print(head);
//
//    }
//}
