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

}
