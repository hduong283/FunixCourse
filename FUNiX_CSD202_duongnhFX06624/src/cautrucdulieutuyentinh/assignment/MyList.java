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
		head = tail =null;
	}

	public boolean isEmpty() {
		return (head == null);
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
		Node<E> new_node = new Node<E>(x);
		if(isEmpty()) {
			head =  new_node;
			tail = new_node;
		}else {
			new_node.next = head;
			head = new_node;// chuyen pointer ve dau node moi tao
		}
		
		
	}
	public void insertToTail(E x) {
		Node<E> new_node = new Node<E>(x);// khoi tao mot node moi co info
		if(isEmpty()) {
			head=tail=new_node;
			return;
			}
		tail.next = new_node;
		tail = new_node;
		System.out.print("tail.info: ");
		System.out.println(tail.info);
		//tail.next = New_node;// chuyen pointer ve dau node moi tao
		
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

	

	// Delete element has value= x
	public void deleteElement(Node<E> x) {
		Node<E> current = head;// khoi tao mot node moi co info
		while(current != null) {
			if(current.next == x) {
				current.next = x.next;
			}
			current = current.next;
		}
		
	}

	// swap 2 elements
	public void swap(Node<E> x1, Node<E> x2) {
		Node<E> preNode1=null, preNode2=null,node1=head,node2=head;
		if(head==null|| x1==x2) {//khong co du lieu
			return;
		}
		//dung node1 de tim kiem gia tri x1
		while(node1 != null && node1 !=x1) {
			preNode1 = node1;
			node1 = node1.next;
		}
		//dung node2 de tim kiem gia tri x2
		while(node2 != null && node2 !=x2) {
			preNode2 = node2;
			node2 = node2.next;
		}
		if(node1 != null && node2 != null) {// ton tai x1 va x2
			if(preNode1!=null)
			preNode1.next = node2;
			else
				head=node2;
			if(preNode2!=null)
			preNode2.next = node1;
			else
				head=node1;
			Node<E> nodeTemp = node1.next;
			node1.next = node2.next;
			node2.next = nodeTemp;
		}else {
			System.out.println("not found");
		}
		
		
	}

	// Delete all Linked List
	public void clear() {
		head=tail=null;
	}
}
