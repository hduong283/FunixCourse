package assignment;

import java.util.Scanner;

public class AS3_Main {
public static void main(String[] args) {
	MyBSTTree treeList = new MyBSTTree();
	Person person = new Person();
	OperationToPerson personImpl = new OperationToPerson();
	getMenu();
	Scanner in = new Scanner(System.in);
	boolean check = true;
	String fileName = null;
	while (check) {
		switch ((in.nextInt())) {
		case 1:System.out.println("1. Insert a new Person & add to TreeList");
		personImpl.createPersonToBST(treeList);   
		treeList.traverseInOrder();
		getMenu();	break;
		case 2:System.out.println("2. Inorder traverse");getMenu();	break;
		case 3:System.out.println("3. Breadth-First Traversal traverse");getMenu();	break;
		case 4:System.out.println("4. Search by Person ID");getMenu();	break;
		case 5:System.out.println("5. Delete by Person ID");getMenu();	break;
		case 6:System.out.println("6. Balancing Binary Search Tree");getMenu();	break;
		case 7:System.out.println("7. DFS_Graph");getMenu();	break;
		case 8:System.out.println("8. Dijkstra");getMenu();	break;
		case 9:System.out.println("9. save to file");getMenu();	break;
		case 0:System.out.println("1. Insert a new Person");check = false;	break;

		default:
			break;
		}
	}in.close();
}

static void getMenu() {
	System.out.println("+-------------------Menu-----------------------------------------+");
	System.out.println("|      1. Insert a new Person                                    |");
	System.out.println("|      2. Inorder traverse                                       |");
	System.out.println("|      3. Breadth-First Traversal traverse                       |");
	System.out.println("|      4. Search by Person ID                                    |");
	System.out.println("|      5. Delete by Person ID                                    |");
	System.out.println("|      6. Balancing Binary Search Tree                           |");
	System.out.println("|      7. DFS_Graph                                              |");
	System.out.println("|      8. Dijkstra                                               |");
	System.out.println("|      0. Ket thuc chuong trinh                                  |");
	System.out.println("+----------------------------------------------------------------+");

}
}
