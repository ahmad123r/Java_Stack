package ListOfAssignment;

public class SinglyLinkedList  {


public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


public Node head;

public void remove() {
	Node temp=head;
	while(temp.next.next != null) {
		temp=temp.next;
		
	}
	Node last=temp.next.next;
	temp.next=null;
	last=null;
	
}


public void add(int value) {
    Node newNode = new Node(value);
    if(head == null) {
        head = newNode;
    } else {
        Node runner = head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }
}
public void DisplayValues() {
    
  Node runner = this.head;
    while(runner.next != null) {
        String s = String.format("Node Value: %s :: Nexint Value: %s", runner.value, runner.next.value);
        System.out.println(s);
        runner = runner.next;
    }
    
    String s = String.format("Node Value: %s :: Nexint Value: null", runner.value);
    System.out.println(s);
}
}