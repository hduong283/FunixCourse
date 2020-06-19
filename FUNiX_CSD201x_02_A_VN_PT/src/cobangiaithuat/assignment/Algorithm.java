package cobangiaithuat.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Algorithm {
	public void write_file(float a[], String fileName){
		
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(a);
			System.out.println("");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error write to file : "+e);
		}
	}
public void insert_data(String fileName) {
		float[] a = {};
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
		}
		sc.close();
		write_file(a,fileName);
		
	}

//2. Read data from file to array

	public  float[] Read_file( String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream intput = new ObjectInputStream(fileInput);
		float[] a =   (float[]) intput.readObject();
		int size =a.length;
		System.out.print("du lieu file :"+filename);
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		intput.close();
		return a;
	}

//3. Sort by Bubble Sort

	public  void BubbleSort(float a[]) {
		System.out.println("Thuat toan Bubble Sort");
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
		System.out.println("Thuat toan Selection Sort");
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
		System.out.println("Thuat toan Insertion Sort");
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

	public  void Search(float a[], float value) {
		System.out.println("tim kiem du lieu tuyen tinh");
		boolean check =false;
		for(int i=0;i< a.length;i++) {
			if(value == a[i]) {
				System.out.println("Chi so la: "+i);
				check =true;
			}else {
				
			}
		}
		if(check == false) {
			System.out.println("gia tri: "+value+" khong co trong mang");
		}
	}

//7. Search by binary Search algorith

	public  int binarySearch(float a[], int l, int size, float value) {
		
		 if (size >= l) { 
	            int mid = l + (size - l) / 2; 
	            // tra ve gia tri neu dung
	            if (a[mid] == value) 
	                return mid; 
	            //neu gia tri tai vi tri tim lon hon gia tri can tim thi tim trong mang ben trai mid
	            if (a[mid] > value) 
	                return binarySearch(a, l, mid - 1, value); 
	  
	            // tim trong mang ben phai mib
	            return binarySearch(a, mid + 1, size, value); 
	        } 
	  
	        //khon gtim thay gia tri
	       return -1;
	}
}
