package cautrucdulieutuyentinh.assignment;
//Lớp MyQueue chứ thông tin và các hành vi cơ bản của queue 
public class MyQueue<T> {
//  Search index of element of product in Linked list, if not founf then return-1
	Node <T>head,tail;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public MyQueue() {
		super();
	}
	
    
}
