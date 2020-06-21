package cautrucdulieutuyentinh.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject<E> {
	E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public void write(E[] data, String fileName) {

		try {
			FileOutputStream fileOut = new FileOutputStream(fileName,true);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(data);
			System.out.println("");
			
			
			fileOut.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error write to file : " + e);
		}
	}
	
	public void writeLinkedList(MyList<E> data, String fileName) {

		try {
			FileOutputStream fileOut = new FileOutputStream(fileName,true);// cho phep ghi ra file neu co du lieu cu
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(data);
			System.out.println("");
			
			
			fileOut.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error write to file : " + e);
		}
	}

	public E read(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fileInput);
		boolean check = true;
		
			
			
				E data =  (E)in.readObject();
				System.out.println(data);
		return data;
			//System.out.println(in.available());
			
		
		
	}
	public MyList<E> readLinkedList(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fileInput);
		boolean check = true;
		
			@SuppressWarnings("unchecked")
			E[] data =  (E[])in.readObject();
			//System.out.println(in.available());
			System.out.println(data);
		
		
		return null;
		
	}

	public ReadWriteObject() {
		super();
		
	}
}
