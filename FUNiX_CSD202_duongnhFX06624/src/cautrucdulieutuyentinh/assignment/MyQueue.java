package cautrucdulieutuyentinh.assignment;

public class MyQueue<E> {
//  Search index of element of product in Linked list, if not founf then return-1
	Node <E>head,tail;


	public MyQueue() {
		head = tail =null;
	}
	public boolean isEmpty() {
		return (head == null);
	}
	public E dequeue() throws Exception {// E: product
		 if(isEmpty()) throw new Exception();
		 E x = head.info;
		 head = head.next;
		 if(head==null) tail=null;
		 return x;
	}
	void enqueue(E x) {
		if(isEmpty()) {
			head =tail=  new Node<E>(x);// ca header va tail deu tro ve cung vi tri ban dau
			head.next = tail;
		}else {
			tail.next=new Node<E>(x);//khi header dung o dau thi tail di chuyen ve phia sau
			tail = tail.next;
		}
		
	}
	E front() throws Exception

    { if(isEmpty()) throw new Exception();

       return(head.info);

     }
	
    
}
