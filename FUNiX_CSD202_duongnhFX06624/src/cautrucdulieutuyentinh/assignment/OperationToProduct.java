package cautrucdulieutuyentinh.assignment;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class OperationToProduct {

	public int index(Product p, MyList<Product> list) {// search index of value
		Node<Product> current = list.head;
		int i = 0;
		while (current != null) {
			i++;
			current = list.head.next;
			if (p == list.head.info) {
				return i;
			}
		}
		return -1;
	}

	// Cread a product have:(ID, name, quantity, price) that input from keyboard
	public Product createProduct() {
		Product p = new Product();
		Scanner sn = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.print("nhap iD:");
			while (check) {
				if (sn.hasNextInt()) {
					p.setiD(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}
			System.out.print("nhap Title:");
			p.setTitle(sn.next());
			System.out.print("nhap Quantity :");
			check = true;
			while (check) {
				if (sn.hasNextInt()) {
					p.setQuantity(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}
			System.out.print("nhap price :");
			check = true;
			while (check) {
				if (sn.hasNextFloat()) {
					p.setPrice(sn.nextFloat());
					check = false;
					System.out.println(p);
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap price :");
					sn.next();
				}
			}
			System.out.println("Ban ket thuc vong lap");
			break;
		}
		return p;
	}

	// Read all products from fike and save to Linked List ( Insert at tail of
	// Linked List), infor of a product in a line (
	public MyList<Product> getAllItemsFromFileToMyList(String fileName, MyList<Product> list) throws EOFException {
		list = new MyList<Product>();
		try {
			FileInputStream fileInput = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileInput);
			Product data = new Product();
			boolean check = true;
			while (check) {
				data = (Product) in.readObject();
				// System.out.println(data);
				if (data != null)
					list.insertToHead(data);
				else
					check = false;
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi doc file: " + e);
		}
		return list;
	}

	public MyStack<Product> getAllItemsFromFileToMyStack(String fileName, MyStack<Product> stack) {
		stack = new MyStack<Product>();
		try {
			FileInputStream fileInput = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileInput);
			Product data = new Product();
			boolean check = true;
			while (check) {
				data = (Product) in.readObject();
				// System.out.println(data);
				if (data != null)
					stack.push(data);
				else
					check = false;
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi doc file: " + e);
		}
		return stack;
	}

	public MyQueue<Product> getAllItemsFromFileToMyQueue(String fileName, MyQueue<Product> queue) {
		queue = new MyQueue<Product>();
		try {
			FileInputStream fileInput = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileInput);
			Product data = new Product();
			boolean check = true;
			while (check) {
				data = (Product) in.readObject();
				// System.out.println(data);
				if (data != null)
					queue.enqueue(data);
				else
					check = false;
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi doc file: " + e);
		}
		return queue;
		// System.out.println(in.available());
	}

	// Add a new product into tail of Linked List
	public void addLast(MyList<Product> list) {
		Product p = new Product();
		Scanner sn = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.print("nhap iD:");
			while (check) {
				if (sn.hasNextInt()) {
					p.setiD(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}

			System.out.print("nhap Title:");
			p.setTitle(sn.next());
			System.out.print("nhap Quantity :");
			check = true;
			while (check) {
				if (sn.hasNextInt()) {
					p.setQuantity(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}
			System.out.print("nhap price :");
			check = true;
			while (check) {
				if (sn.hasNextFloat()) {
					p.setPrice(sn.nextFloat());
					check = false;
					System.out.println(p);
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap price :");
					sn.next();
				}
			}
			System.out.println("Ban da nhap xong");
			// sn.close();
			break;
		}

		list.insertToTail(p);
	}

	// Display infor of all product on Linked list
	public void displayAll(MyList<Product> list) {
	}

	// Wite all product of Linked List to file
	public void writeAllItemsToFile(String fileName, MyList<Product> list) {
		Node<Product> current = list.head;

		int i = 0;
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			System.out.println("");
			while (current != null) {
				i++;
				out.writeObject(current.info);
				current = current.next;
			}
			out.writeObject(null);
			fileOut.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error write to file : " + e);
		}
	}

	// Search first element by ID
	public Product searchByCode(MyList<Product> list, int iD) {
		Node<Product> current = list.head;
		while (current != null) {
			if (current.info.getiD() == iD) {
				return current.info;
			}
			current = current.next;
		}
		return null;
	}

	// Delete first element by ID (=ID)
	public void deleteByCode(MyList<Product> list, int iD) {
		Node<Product> current = list.head;
		while (current != null) {
			if (current.info.getiD() == iD) {
				list.deleteElement(current);
			}
			current = current.next;
		}
	}

	// Sort by ID
	public void sortByCode(MyList<Product> list) {
		Node<Product> pi, pj;
		int t;
		pi = list.head;
		while (pi != null) {
			pj = pi.next;
			while (pj != null) {
				if (pj.info.getiD() < pi.info.getiD()) {
					/*
					 * t = pi.info.getiD(); pi.info = pj.info; pj.info.setiD(t);
					 */
					/*
					 * pi.next = pj.next; pj.next = pi;
					 */
					pj.info = pi.info;
					pi.info = (Product) pi.next.info;
				}
				pj = pj.next;
			}
			pi = pi.next;
		}
	}

	// Add new product to head of Linked list
	public void addFirst(MyList<Product> list) {
		Product p = new Product();
		Scanner sn = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.print("nhap iD:");
			while (check) {
				if (sn.hasNextInt()) {
					p.setiD(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}

			System.out.print("nhap Title:");
			p.setTitle(sn.next());
			System.out.print("nhap Quantity :");
			check = true;
			while (check) {
				if (sn.hasNextInt()) {
					p.setQuantity(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}
			System.out.print("nhap price :");
			check = true;
			while (check) {
				if (sn.hasNextFloat()) {
					p.setPrice(sn.nextFloat());
					check = false;
					System.out.println(p);
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap price :");
					sn.next();
				}
			}
			System.out.println("Ban da nhap xong");
			// sn.close();
			break;
		}

		list.insertToHead(p);
	}
	// Conver to binary
	public int Convert_Binary(int i) {
		int binary;
		if(i==0) {
			binary =0;
		}else {
			binary =i%2+ 10*Convert_Binary(i/2);
		}return binary;
	}
	

}
