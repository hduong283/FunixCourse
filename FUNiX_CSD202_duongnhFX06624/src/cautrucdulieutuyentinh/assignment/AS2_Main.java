package cautrucdulieutuyentinh.assignment;

import java.io.IOException;
import java.util.Scanner;

public class AS2_Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		getMenu();
		MyList<Product> productList = new MyList<Product>();// khoi tao mot linked list product
		Node<Product> current;// tao mot pointer de duyet cac phan tu

		OperationToProduct operation = new OperationToProduct();
		ReadWriteObject<Product> rw = new ReadWriteObject<Product>();

		Scanner in = new Scanner(System.in);
		boolean check = true;
		String fileName = null;
		while (check) {
			switch (in.nextInt()) {
			case 1:
				System.out.println("1.Load data from file and display ");
				fileName = "data.txt";
				
				productList= operation.getAllItemsFromFile(fileName, productList);
				current = productList.head;
				while (current != null) {
					System.out.println(current.info);
					current = current.next;
				}
				System.out.println("chieu dai: "+productList.length());
				getMenu();
				break;
			case 2:
				System.out.println(" 2.Input & add to the end. ");
				//operation.addLast(productList);
				operation.addLast(productList);
				current = productList.head;
				while (current != null) {
					System.out.println(current.info);
					current = current.next;
				}
				getMenu();
				break;
			case 3:
				System.out.println("3.Display data :");
				current = productList.head;
				while (current != null) {
					System.out.println(current.info);
					current = current.next;
				}
				getMenu();
				break;
			case 4:
				System.out.println("4.Save product list to file :");
				fileName = "data.txt";
				operation.writeAllItemsToFile(fileName, productList);
				getMenu();
				break;
			case 5:
				System.out.println("Ban chon 5");
				getMenu();
				break;
			case 6:
				System.out.println("Ban chon 6");
				getMenu();
				break;
			case 7:
				System.out.println("Ban chon 7");
				getMenu();
				break;
			case 8:
				System.out.println("Ban chon 8");
				getMenu();
				break;
			case 9:
				System.out.println("Ban chon 9");
				getMenu();
				break;
			case 10:
				System.out.println("Ban chon 10");
				getMenu();
				break;
			case 0:
				System.out.println("Ket thuc chuong trinh");
				check = false;
				break;

			default:
				check = false;
				break;
			}

		}
	}

	static void getMenu() {
		System.out.println("+-------------------Menu--------------------+");
		System.out.println("|      1.Load data from file and display    |");
		System.out.println("|      2.Input & add to the end.            |");
		System.out.println("|      3.Display data                       |");
		System.out.println("|      4.Save product list to file          |");
		System.out.println("|      5.Search by ID                       |");
		System.out.println("|      6.Delete by ID                       |");
		System.out.println("|      7.Sort by ID                         |");
		System.out.println("|      8.Convert to Binary                  |");
		System.out.println("|      9.Load to stack and display          |");
		System.out.println("|      10.Load to queue and display         |");
		System.out.println("|      0.Ket thuc chuong trinh              |");
		System.out.println("+-------------------------------------------+");

	}

}
