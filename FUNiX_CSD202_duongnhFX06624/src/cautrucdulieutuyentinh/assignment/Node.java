package cautrucdulieutuyentinh.assignment;
//Lớp Node để quản lý thông tin và hành  của vi mỗi node trong danh sách
public class Node<E> {
	//gom 2 thanh phan
	E info;//node.info
	Node next;//node.next
	
	public E getInfo() {
		return info;
	}
	public void setInfo(E info) {
		this.info = info;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node() {
		super();
	}
	public Node(E info,Node p) {// khoi tai mot node
		this.info = info;
		this.next = p;
	}
	public Node(E info) {
		this(info,null);
	}
	

}
