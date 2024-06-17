package striver;


class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};

//Coverting Array to a linked List - O(n)

public class LinkedList {
    private static Node arrayToLinkedList(int [] arr ){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //Search in a linkedlist
    private static int check(Node head,int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return  0;
    }
    //Print the count of the linked List

    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
        // System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        return count;
    }
        // System.out.print(head.data);

    public static void main(String[] args) {
        int arr[] = {12,5,6,8};
        //Simple Linked List
        //Node y = new Node(arr[3]);
        //System.out.println(y.data);

        //Calling for method arrayToLinkedList
        Node head = arrayToLinkedList(arr);
//To print all the elements of the linked List

        //        Node temp = head;
        //        while(temp != null){
        //            System.out.print(temp.data + " ");
        //            temp = temp.next;
        //        }
        System.out.print(lengthOfLL(head) + " ");
        System.out.println(check(head,12));


    }
}
