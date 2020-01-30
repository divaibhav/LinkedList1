/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:38 AM
 */
package doublylinkedlist.node;

public class Node {
    // to store data
    private int data;
    // to keep reference of next node
    private Node next;
    // to keep reference of previous node
    private Node previous;

    // constructor to initialize data, next and previous
    public Node(int data){
        this.data = data;
        next = null;
        previous = null;
    }
    //getter and setter for field
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
