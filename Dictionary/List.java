
public class List {
	
	private Node head;
	
	public Node getHead(){
		return this.head;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	private Node getNodeContainingLetter(char letter){
		
		Node current_node = this.head;
		
		while(current_node != null){
			if(current_node.getLetter() == letter){
				return current_node;
			}
			current_node = current_node.getNextNode();
		}
		return null;
		
	}
	
	public Node find_or_insertEnd(char letter){
		Node current_node = this.head;
		while(current_node != null) {
			if (current_node.getLetter() == letter) {
				return current_node;
			}
			
			if (current_node.getNextNode() == null) {
				break;
			}
			
			current_node = current_node.getNextNode();
		}
		
		Node new_node = new Node(letter);
		if (this.head == null) {
			this.head = new_node;
		} else {
			current_node.setNextNode(new_node);
		}
		
		return new_node;
	}
	
	public String toString(){
		if(head != null){
			return toString(this.head,"");
		}
		return null;
	}
	
	private String toString(Node node, String s){
		s = Character.toString(node.getLetter());
		if(node.getNextNode() != null){
			return toString(node.getNextNode(),s);
		} else {
			return s;
		}
	}
}
