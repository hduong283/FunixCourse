package cobangiaithuat.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Algorithm {
	public void write_flie(float a[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n =0;
		System.out.print("Input number of elements: ");
		if(sc.hasNextInt()) {
			n = sc.nextInt();
			a = new float[n];
					}
		System.out.println("Input elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
		FileOutputStream fileOut = new FileOutputStream("input.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(a);
		
	}

//2. Read data from file to array

	public  float[] Read_file(float a[], int size) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream("input.txt");
		ObjectInputStream intput = new ObjectInputStream(fileInput);
		a =   (float[]) intput.readObject();
		size =a.length;
		System.out.print("du lieu file input.txt: ");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		return a;
	}

//3. Sort by Bubble Sort

	public  void BubbleSort(float a[]) {
		 float temp =0;
		 boolean check = true;
		 System.out.println();
		
		 
		 while(check) {
			 check =  false;
			 for(int i=0;i<a.length-1;i++) {
				 temp = a[i];
				 if(a[i]>a[i+1]) {
					 temp = a[i+1];
					 a[i+1]=a[i];
					 a[i]=temp;
					 check =  true;
				 }
			 }
			 for(float d:a) {
				 System.out.print(d+"  ");
			 }
			 System.out.println("");
			 
		 }
		
		 
	}

//4. Sort bay Selection Sort

	public  void SelectionSort(float a[]) {
		float min;
		int min_localtion;
		
		for(int i=0;i<a.length;i++) {
			min = a[i];
			min_localtion = i;
			for(int j=i+1;j<a.length;j++) {
				if(min>a[j]) {
					min = a[j];
					min_localtion = j;
				}
				
			}
			a[min_localtion]=a[i];
			a[i]=min;
			for(float d:a) {
				System.out.print(d+"  ");
			}
			System.out.println("");
		}
		
	}

//5. Sort by Insertion Sort

	public void InsertionSort(float a[]) {
		 float temp = 0;
		 int j;
		
		 for(int i=0;i<a.length-1;i++) {
			 temp = a[i+1];
			 j=i;
			 //quet du lieu lai tu vi tri i
			 //vi viec quet nay khong xac dinh duoc so vong lap nen ta dung while
			 while(temp < a[j]&j>=0){
				 a[j+1] = a[j];
				 a[j] = temp;
				 temp = a[j];
				 j = j-1;
				 if(j<0) {
					 j=0;
				 }
				
			 }
			 for(float d:a) {
				 System.out.print(d+"  ");
			 } System.out.println("");
			
		 }
		 
		
	}

//6. Serach by Linear Search algorith:

	public static void Search(float a[], float value) {

	}

//7. Search by binary Search algorith

	public static int binarySearch(float a[], int l, int r, float x) {
		return 0;
	}
}
