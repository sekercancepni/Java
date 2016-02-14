
public class Node {
	
	private char letter;
	private Node nextNode;
	private List nextList;
	private boolean end;
	
	public Node(char newLetter){
		this.letter = newLetter;
		this.nextNode = null;
		this.nextList = null;
	}
	
	public char getLetter(){
		return this.letter;
	}
	
	public void setLetter(char newLetter){
		this.letter = newLetter;
	}
	
	public Node getNextNode(){
		return this.nextNode;
	}
	
	public void setNextNode(Node newNextNode){
		this.nextNode = newNextNode;
	}
	
	public List getNextList(){
		return this.nextList;
	}
	
	public void setNextList(List newNextList){
		this.nextList = newNextList;
	}
	
	public boolean hasNextNode(){
		if(this.nextNode != null){
			return true;
		}
		return false;
	}
	
	public boolean hasNextList(){
		if(this.nextList != null){
			return true;
		}
		return false;
	}
	
	public boolean isEnd(){
		if(this.end == false){
			return false;
		}
		return true;
	}
	
	public void makeEnd(){
		this.end = true;
	}
	
	public boolean hasSameLetter(char letter){
		if(this.letter == letter){
			return true;
		}
		return false;
	}
	
	public Node find_or_insert_InNextList(char letter){
		
		
	}
	
	public String toString(){
		String letter_str = Character.toString(this.letter);
		return letter_str;
	}
	
	
	
	
	
}
