/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:41 AM
 */
package doublylinkedlist.linkedlist;

import doublylinkedlist.node.Node;

public class MyDoublyLinkedList {

    private Node head;


    public MyDoublyLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        if(head == null) {
            node.setNext(head);
            head = node;
        }
        else{
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }
    }
    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }

    public Node deleteFromBeginning(){
        Node response = null;
        if(head != null){
            response = head;
            head = head.getNext();
            head.setPrevious(null);
        }

        return response;
    }

    public Node deleteFromLast(){
        Node response = null;
        if(head != null){
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            if(temp.getPrevious() != null){
                response = temp;
                temp = temp.getPrevious();
                temp.setNext(null);

            }
            else{
                response = head;
                head = null;
            }
        }

        return response;
    }

    public  void printList(){
        System.out.println("printing list");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
            if(temp != null){
                System.out.print("<--->");
            }
        }
        System.out.println();
    }

}
