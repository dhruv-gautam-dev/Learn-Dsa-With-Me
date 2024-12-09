import org.w3c.dom.Node;

public class b_insertionInLinkedList {
  Node head; // initialized head in node

  class Node {
    int data;
    Node next;

    Node(int d) { // constructor of class Node
      data = d;
      next = null;
    }
  }

  // implementation of insertion of the node at the Beginning
  public void insertAtBeg(int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
  }

  // implementation of insertion of the node after any node
  public void insertAfterAnyNode(Node prev_Node, int newData) {
    Node newNode = new Node(newData);
    if (prev_Node == null) {
      System.out.println("previous node can not contain null value");
      return;
    }

    newNode.next = prev_Node.next;
    prev_Node.next = newNode;
  }

  // implementation of insertion of the node at the end

  public void insertAtEnd(int newData) {
    Node newNode = new Node(newData);

    // is linkedList empty
    if (head == null) {
      head = new Node(newData);
      return;
    }
    // if linkedList is not Empty
    newNode.next = null;
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    return;
  }

  // implimantation to print the linkedList

  public void displayLinkedList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    b_insertionInLinkedList list1 = new b_insertionInLinkedList();
    list1.insertAtEnd(2);
    list1.insertAtEnd(4);
    System.out.println("insert data at end ");

    list1.insertAtEnd(8);
    System.out.println("orignal linedList is ");
    list1.displayLinkedList();
    System.out.println();
    System.out.println("lets insert data at Beginning ");
    list1.insertAtBeg(1);
    list1.displayLinkedList();

    list1.insertAfterAnyNode(list1.head.next.next, 10);
    System.out.println();

    System.out.println("lets insert data after any node ");

    list1.displayLinkedList();

  }
}

/* Insertion */
// we can do Insertion in 3 ways
// {
// >>1.End
// >>2.Beginning
// >>3.At any location
// }

/* Insertion at the end */
// {
// 1.make the newNode value to head
// 2.we have to traverse the last node using while loop
// 2.update the pointer(next) of last node to newNode
// }

/* Insertion at the beginning */
// {
// 1.create a newNode
// 2.update the pointer(next) of new node to head value
// 3.update the head to newNode
// }
