package cautrucdulieutuyentinh.assignment;

import java.io.Serializable;

public class Product implements Serializable {
	private int iD;
	private String title;
	private int quantity;
	private float price;
	
	public Product() {
		super();
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [iD=" + iD + ", title=" + title + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public Product(int iD, String title, int quantity, float price) {
		super();
		this.iD = iD;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}

	
	
	
	
}
