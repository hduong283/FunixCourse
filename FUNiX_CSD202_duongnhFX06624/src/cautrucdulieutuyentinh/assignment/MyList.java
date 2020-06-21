package cautrucdulieutuyentinh.assignment;

//Lớp MyList chứa thông tin và hành vi cơ bản của một danh sách móc nối
public class MyList<E> {
	Node<E> head;
	Node<E> tail;

	// Constructor method

	public MyList(Node head, Node tail) {
		this.head = head;

	}

	public MyList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		
		return (head == null && tail ==null);
	}
	

	// Size of LinkedList
	public int length() {
		// muon xac dinh chieu dai thi phai duyet n phan tu
		Node<E> current = head;// khoi tao mot node moi tai dau danh sach
		int i = 0;
		while (current != null) {

			current = current.next;
			i++;
		}
		return i;
	}

	// Insert to head of Linked List
	public void insertToHead(E x) {
		Node<E> New_node = new Node<E>(x);// khoi tao mot node moi co info
		New_node.next = head;
		head = New_node;// chuyen pointer ve dau node moi tao
		
	}
	public void insertToTail(E x) {
		Node<E> New_node = new Node<E>(x);// khoi tao mot node moi co info
		if(isEmpty()) {
			head=tail=New_node;
			return;
			}
		tail.next = New_node;// chuyen pointer ve dau node moi tao
		tail=New_node;
	}
	

	// Insert after of position k
	public void insertAfterPosition(int position, Node<E> x) {
		Node<E> nodeAtPosition = searchByPosition(position);
		if (nodeAtPosition != null) {
			x.next = nodeAtPosition.next;
			nodeAtPosition.next = x;
		}
	}

	public Node<E> searchByPosition(int position) {
		Node<E> current = head;// khoi tao mot node moi co info
		for (int i = 0; i < position; i++) {
			if (current.next == null) {
				return null;
			}
			current = head.next;
		}
		return current;
	}

	// Delete element at tail of Linked List
	public void deleteTail() {
	}

	// Delete element has value= x
	public void deleteElement(E x) {
	}

	// swap 2 elements
	public void swap(Node<E> x1, Node<E> x2) {
	}

	// Delete all Linked List
	public void clear() {
		head=tail=null;
	}
}
