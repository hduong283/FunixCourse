package assignment;

public class MyBSTTree {
	public TreeNode root;
	public TreeNode find(int iD) {
		if(root != null)
			return root.find(iD);
		return null;
	}
	public void insert(Person data) {
		if(root == null) {
			root = new TreeNode(data);
		}else {
			root.insert(data);
		}
	}
	public void delete(Person data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftNode = true;
		while(current != null && current.getData() != data) {
			parent = current;
			if(data.getiD() < current.getData().getiD()) {
				current = current.getLeftNode();
				isLeftNode = true;
			}else {
				current = current.getRightNode();
				isLeftNode = false;
			}
		}
		if(current == null) {
			return;
		}
		if(current.getLeftNode() == null & current.getRightNode() == null) {// neu current la leef
			if(current == root) {
				root = null;
			}else {
				if(isLeftNode) {
					parent.setLeftNode(null);
				}else {
					parent.setRightNode(null);
				}
			}
			
		}else if(current.getLeftNode() == null){
			if(current == root) {
				root = current.getRightNode();
			}else {
				if(isLeftNode) {
					parent.setLeftNode(current.getRightNode());
				}else {
					parent.setRightNode(current.getRightNode());
				}
			}
		}else if(current.getRightNode() == null){
			if(current == root) {
				root = current.getLeftNode();
			}else {
				if(isLeftNode) {
					parent.setLeftNode(current.getLeftNode());
				}else {
					parent.setRightNode(current.getLeftNode());
				}
			}
		}else {
			if(current == root) {
				root = current.getRightNode();
			}
		}
		
	}
	public void traverseInOrder() {
		if (this.root != null)
			this.root.traverseInOrder();
		System.out.println();
	}
	
	public boolean checkDuplicate(Person data) {
		if(this.root != null) {
			if(data.getiD() == this.root.getData().getiD()) {
				return true;
			}else {
				return this.root.checkDataDuplicate(data);
			}
		}return false;
	}
}
