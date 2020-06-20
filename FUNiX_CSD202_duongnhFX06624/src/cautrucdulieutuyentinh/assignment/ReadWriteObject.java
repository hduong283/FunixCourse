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
			FileOutputStream fileOut = new FileOutputStream(fileName);
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

	public E[] read(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fileInput);
		E[] a =  (E[])in.readObject();
		System.out.println("");
		in.close();
		return a;
	}

	public ReadWriteObject() {
		super();
		
	}
}
