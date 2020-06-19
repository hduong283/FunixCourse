package cautrucdulieutuyentinh.assignment;
//Lớp Node để quản lý thông tin và hành  của vi mỗi node trong danh sách
public class Node<T> {
	private T info;
	Node next;
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
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
	

}
