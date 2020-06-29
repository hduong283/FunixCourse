package assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class OperationToPerson {
	public void createPersonToBST(MyBSTTree list) {
		Person p = new Person();
		Scanner sn = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.print("nhap iD:");
			while (check) {
				if (sn.hasNextInt()) {
					p.setiD(sn.nextInt());
					check = false;
				} else {
					check = true;
					System.out.println("ban phai nhap lai ky tu bang so:");
					System.out.print("nhap iD:");
					sn.next();
				}
			}
			System.out.print("nhap Name:");
			p.setName(sn.next());
			System.out.print("nhap Ngay Sinh :");
			p.setBirthDay(sn.next());
			System.out.print("nhap Noi Sinh :");
			p.setPlace(sn.next());
			
			break;
		}
		System.out.println("insert to tree list");
		list.insert(p);
	}
	// Wite all product of Linked List to file
		public void writeAllItemsToFile(String fileName, MyBSTTree list) {
			TreeNode current = list.root;

			int i = 0;
			try {
				FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut);

				System.out.println("");
				while (current != null) {
					i++;
					//out.writeObject(current.info);
					//current = current.next;
				}
				out.writeObject(null);
				fileOut.close();
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error write to file : " + e);
			}
		}
		
}
