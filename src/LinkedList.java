import java.lang.reflect.Type;
import java.util.*;

public class LinkedList<Type> implements Stack<Type> {

    protected Node<Type> head;
    protected Node<Type> tail;



     class Node<Type>  {
        Type data;
        Node<Type> next;
        Node<Type> prev;
        // you will need to figure out how to hook this up.

        Node(Type d) {
        this.data = d;
        this.next = null;
    }

    }

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void push(Type d) {
        addInFront(d);
    }

    public Type pop() {
        Type returnval = head.data;
        remove(returnval);
        return returnval;
    }

    public boolean isEmpty() {
        return (head == null);
    }


    // your methods will go here.

    public void addInFront(Type d) {


    }

    public void print() {

    }

    public boolean contains(Type d) {
        return false;
    }


    public void remove(int i) {
    }
}










