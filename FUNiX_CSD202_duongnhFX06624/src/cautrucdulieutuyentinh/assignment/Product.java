package cautrucdulieutuyentinh.assignment;

public class Product {
	private int iD;
	private String title;
	private String quantity;
	private String price;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Product(int iD, String title, String quantity, String price) {
		super();
		this.iD = iD;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [iD=" + iD + ", title=" + title + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
