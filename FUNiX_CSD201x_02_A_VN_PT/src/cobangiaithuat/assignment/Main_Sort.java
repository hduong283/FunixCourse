package cobangiaithuat.assignment;

import java.io.IOException;
import java.util.Scanner;

public class Main_Sort {
	static float[] a = {};
	static int size = 0;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		getMenu();
		Scanner in = new Scanner(System.in);
		boolean check=true;
		Algorithm algorithm = new Algorithm();
		while(check) {
			switch (in.nextInt()) {
			case 1:System.out.println("Ban chon 1");
			algorithm.write_flie(a);
			getMenu();
			break;
			case 2:System.out.println("Ban chon 2");
			a = algorithm.Read_file(a, a.length);
			getMenu();
			break;
			case 3:System.out.println("Ban chon 3");
			a = algorithm.Read_file(a, a.length);
			algorithm.BubbleSort(a);
			getMenu();
			break;
			case 4:System.out.println("Ban chon 4");
			float[] c = a;a = algorithm.Read_file(a, a.length);
			algorithm.SelectionSort(a);
			getMenu();
			break;
			case 5:System.out.println("Ban chon 5");
			a = algorithm.Read_file(a, a.length);
			algorithm.InsertionSort(a);
			getMenu();
			break;
			case 6:System.out.println("Ban chon 6");
			a = algorithm.Read_file(a, a.length);
			System.out.println("Nhap gia tri can tim: ");
			float value = in.nextFloat();
			algorithm.Search(a,value );
			getMenu();
			break;
			case 7:System.out.println("Ban chon 7");
			algorithm.InsertionSort(a);
			System.out.println("Nhap gia tri can tim: ");
			float x = in.nextFloat();
			int len = a.length;
			int result = algorithm.binarySearch(a, 0, len-1, x);
			if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); 
			
			getMenu();
			break;
			case 0:System.out.println("Thoat chuong trinh");
			check=false;
			break;
			
			}
			
		}in.close();
	}
	static void getMenu() {
		System.out.println("+-------------------Menu------------------+");
		System.out.println("|      1.Input                             |");
		System.out.println("|      2.Output                            |");
		System.out.println("|      3.Bubble sort                       |");
		System.out.println("|      4.Selection sort                    |");
		System.out.println("|      5.Insertion sort                    |");
		System.out.println("|      6.Search > value                    |");
		System.out.println("|      7.Search = value                    |");
		System.out.println("|      0.Exit                              |");
		System.out.println("+-----------------------------------------+");
	}
}
