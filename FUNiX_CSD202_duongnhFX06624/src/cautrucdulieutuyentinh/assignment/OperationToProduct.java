package cautrucdulieutuyentinh.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OperationToProduct {
	public int index(Product p, MyList<Product> list) {
		return 0;
	}

	// Cread a product have:(ID, name, quantity, price) that input from keyboard
	public Product createProduct() {
		return null;
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

	public void write_file(Product data, String fileName) {

		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(fileOut);
			System.out.println("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error write to file : " + e);
		}
	}

	public Product[] Read_file(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream intput = new ObjectInputStream(fileInput);
		Product a =  (Product)intput.readObject();
		
		System.out.println("");
		return a;
	}
}
