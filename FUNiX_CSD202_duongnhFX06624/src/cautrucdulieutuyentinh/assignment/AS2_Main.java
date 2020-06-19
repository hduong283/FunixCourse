package cautrucdulieutuyentinh.assignment;

import java.util.Scanner;

//Lớp AS2_Main là lớp để tạo menu và thực hiện thực hiện các chức năng  trong lớp ProductEngine của bài toán
public class AS2_Main {
public static void main(String[] args) {
	getMenu();
	Scanner in = new Scanner(System.in);
	boolean check  = true;
	while (check) {
		switch (in.nextInt()) {
		case 1:System.out.println("Ban chon 1");getMenu();break;
		case 2:System.out.println("Ban chon 2");getMenu();break;
		case 3:System.out.println("Ban chon 3");getMenu();break;
		case 4:System.out.println("Ban chon 4");getMenu();break;
		case 5:System.out.println("Ban chon 5");getMenu();break;
		case 6:System.out.println("Ban chon 6");getMenu();break;
		case 7:System.out.println("Ban chon 7");getMenu();break;
		case 8:System.out.println("Ban chon 8");getMenu();break;
		case 9:System.out.println("Ban chon 9");getMenu();break;
		case 10:System.out.println("Ban chon 10");getMenu();break;
		case 0:System.out.println("Ket thuc chuong trinh");check = false;break;
		

		default:
			check = false;break;
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
