import java.io.*;

public class LinkedList{
    Node head; //head of list

    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // to insert new node
    public static LinkedList insert_node(LinkedList list, Node n){
        //creat new node with given data
        n.next = null;

        //if list is empty then make new node head
        if(list.head == null){
            list.head = n;
        } else{
            //else traverse till last node and insert
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = n;
        }
        return list;
    }
    // insert with int
    public static LinkedList insert_int(LinkedList list, int data){
        //creat new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        //if list is empty then make new node head
        if(list.head == null){
            list.head = new_node;
        } else{
            //else traverse till last node and insert
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    // remove duplicates from an unsorted linked list
    public static void deleteDups(LinkedList list){
        Node curr = list.head;
        while(curr!=null){
            Node temp = curr;
            while(temp.next != null){
                if(temp.next.data == curr.data){
                    temp.next = temp.next.next;
                } else{
                    temp = temp.next;
                }             
            }
            curr = curr.next;
        }
    }

    // remove given node from linked list
    // input: a->b->c->d->e
    // output: a->b->d->e
    public static boolean deleteNode(Node n){
        if(n==null||n.next==null){
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    public static int printKthToLast(Node head, int k){
        // recursive
        if(head == null){
            return 0;
        } 
        int index = printKthToLast(head.next, k)+1;
        if(index==k){
            System.out.println(k + "th to last node is: " +head.data);
        }
        return index;
    }

    public static void printList(LinkedList list){
        Node curNode = list.head;
        System.out.print("LinkedList: ");

        while(curNode != null){
            System.out.print(curNode.data+ " ");
            curNode = curNode.next;
        }
    }

    public static void main (String[]args){
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        insert_node(list,head);
        insert_int(list,2);
        Node third = new Node(4);
        insert_node(list,third);
        insert_int(list,5);
        insert_int(list,6);
        insert_int(list,6);
        printList(list);
        System.out.println();
        printKthToLast(head, 1);

        deleteNode(third);
        printList(list);
        System.out.println();   

        deleteDups(list);
        printList(list);
    
    }
}