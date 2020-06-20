package cautrucdulieutuyentinh.assignment;

import java.util.Scanner;

public class OperationToProduct {
	ReadWriteObject rwObj = new ReadWriteObject<Product>();

	public int index(Product p, MyList<Product> list) {
		return 0;
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
			p.setQuantity(sn.next());
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
			//sn.close();
			break;
		}
		
		return p;
	}

	// Read all products from fike and save to Linked List ( Insert at tail of
	// Linked List), infor of a product in a line (
	public void getAllItemsFromFile(String fileName, MyList<Product> list) {
	}

	public void getAllItemsFromFile(String fileName, MyStack<Product> stack) {

	}

	public void getAllItemsFromFile(String fileName, MyQueue<Product> queue) {
	}

	// Add a new product into tail of Linked List
	public void addLast(MyList<Product> list) {
	}

	// Display infor of all product on Linked list
	public void displayAll(MyList<Product> list) {
	}

	// Wite all product of Linked List to file
	public void writeAllItemsToFile(String fileName, MyList<Product> list) {
	}

	// Search first element by ID
	public void searchByCode(MyList<Product> list) {
	}

	// Delete first element by ID (=ID)
	public void deleteByCode(MyList<Product> list) {
	}

	// Sort by ID
	public void sortByCode(MyList<Product> list) {
	}

	// Add new product to head of Linked list
	public void addFirst(MyList<Product> list) {
	}

	// Conver to binary
	public void Convert_Binary(int i) {
	}

	// Delete element at position k
	public void deletePosition(MyList<Product> list) {
	}

}
