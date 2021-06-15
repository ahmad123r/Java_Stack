package ListOfAssignment;
public class Node {
    public int value;
    public Node next;
    public Node() {
    	this.value=(Integer) null;
    }
    public Node(int value) {
        this.value=value;
    }
    
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}