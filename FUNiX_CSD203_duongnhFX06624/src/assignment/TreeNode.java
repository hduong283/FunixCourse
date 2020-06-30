package assignment;

public class TreeNode {
	private Person data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	public Person getData() {
		return data;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	public TreeNode(Person data) {
		this.data =data;
		this.rightNode = null;
		this.leftNode = null;
	}
	public TreeNode find(Person data) {
		if(this.data == data) {
			return this;
		}
		if(data.getiD() <  this.data.getiD() && leftNode != null) {
			return this.leftNode.find(data);
		}
		if(data.getiD() > this.data.getiD() && rightNode != null) {
			return this.rightNode.find(data);
		}
		return null;
	}
	public boolean isEmpty() {
		return this.data == null;
	}
	public void insert(Person data) {
		System.out.println(" this.data.getiD():"+ this.data.getiD());
		System.out.println("data.getiD():"+data.getiD());
		
		if(data.getiD() >= this.data.getiD()) {
			if(this.rightNode == null) {
				
				this.rightNode = new TreeNode(data);
			}else {
				System.out.println("this.rightNode == "+this.rightNode.getData());
				insert(data);
			}
		}else {
			if(this.leftNode == null) {
				this.leftNode = new TreeNode(data);
			}else {
				insert(data);
			}
		}
	}
	public void traverseInOrder() {
		if (this.leftNode != null)
			this.leftNode.traverseInOrder();
		System.out.println(this.data + " ");
		if (this.rightNode != null)
			this.rightNode.traverseInOrder();
	}
}
