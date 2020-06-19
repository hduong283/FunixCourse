package cobangiaithuat.assignment;

import java.io.IOException;
import java.util.Scanner;

public class Main_Sort {
	static float[] a = {};
	static int size = 0;
	static float value;
	static String fileNameInput = "", fileNameOutput = "";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		getMenu();
		Scanner in = new Scanner(System.in);
		boolean check = true;
		Algorithm algorithm = new Algorithm();
		while (check) {
			
			switch (in.nextInt()) {

			case 1:
				System.out.println("Ban chon 1:");
				fileNameInput = "input.txt";
				algorithm.insert_data(fileNameInput);// nhap du lieu va ghi vao file
				getMenu();
				break;
			case 2:
				System.out.println("Ban chon 2:");
				fileNameInput = "input.txt";
				a = algorithm.Read_file(fileNameInput);//doc du lieu ra man hinh
				getMenu();
				break;
			case 3:
				System.out.println("Ban chon 3:");
				fileNameInput = "input.txt";
				fileNameOutput = "output2.txt";
				a = algorithm.Read_file(fileNameInput);
				algorithm.BubbleSort(a);
				algorithm.write_file(a, fileNameOutput);
				getMenu();
				break;
			case 4:
				System.out.println("Ban chon 4:");
				fileNameInput = "input.txt";
				fileNameOutput = "output3.txt";
				a = algorithm.Read_file(fileNameInput);
				algorithm.SelectionSort(a);
				algorithm.write_file(a, fileNameOutput);
				getMenu();
				break;
			case 5:
				System.out.println("Ban chon 5:");
				fileNameInput = "input.txt";
				fileNameOutput = "output4.txt";
				a = algorithm.Read_file(fileNameInput);
				algorithm.InsertionSort(a);
				algorithm.write_file(a, fileNameOutput);
				getMenu();
				break;
			case 6:
				System.out.println("Ban chon 6:");
				a = algorithm.Read_file(fileNameInput);
				System.out.println("Nhap gia tri can tim: ");
				value = in.nextFloat();
				algorithm.Search(a, value);
				getMenu();
				break;
			case 7:
				System.out.println("Ban chon 7:");
				System.out.println("Tim kiem du lieu nhi phan:");
				fileNameOutput = "output4.txt";
				a = algorithm.Read_file(fileNameOutput);
				System.out.println("Nhap gia tri can tim: ");
				value = in.nextFloat();
				size = a.length;
				int result = algorithm.binarySearch(a, 0, size - 1, value);
				if (result == -1)
					System.out.println("Khong ton tai gia tri nay trong mang");
				else
					System.out.println("gia tri co chi so index: " + result);

				getMenu();
				break;
			case 0:
				check = false;
				System.out.println("Ban da thoat chuong trinh");
				break;
			default: System.out.println("Ban chi nhap so tu 0-->7");System.out.println("Xin vui long nhap lai");
			getMenu();
			break;
			}
		

		}
		
		in.close();
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
