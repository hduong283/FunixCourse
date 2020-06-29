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
	public TreeNode find(int iD) {
		if(this.data.getiD() == iD) {
			return this;
		}
		if(iD <  this.data.getiD() && leftNode != null) {
			return this.leftNode.find(iD);
		}
		if(iD > this.data.getiD() && rightNode != null) {
			return this.rightNode.find(iD);
		}
		return null;
	}
	public boolean isEmpty() {
		return this.data == null;
	}
	public void insert(Person data) {
		if(data.getiD() > this.data.getiD()) {
			if(this.rightNode == null) {
				this.rightNode = new TreeNode(data);
			}else {
				
				this.rightNode.insert(data);
			}
		}else {
			if(this.leftNode == null) {
				this.leftNode = new TreeNode(data);
			}else {
				this.leftNode.insert(data);
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
	public boolean checkDataDuplicate(Person data) {
		if(this.leftNode !=null ) {
			if(this.leftNode.data.getiD() == data.getiD()) {
				return true;
			}else {
				return this.leftNode.checkDataDuplicate(data);
			}
		}
		if(this.rightNode !=null ) {
			if(this.rightNode.data.getiD() == data.getiD()) {
				return true;
			}else {
				return this.rightNode.checkDataDuplicate(data);
			}
		}
		return false;
	}
	
}
