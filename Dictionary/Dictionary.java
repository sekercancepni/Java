
public class Dictionary {
	private List list;
	
	public Dictionary(){
		List new_list = new List();
	}
	
	public List getList(){
		return this.list;
	}
	
	public void insert(String word) {
		char[] same_word = word.toCharArray();
		
		if (this.list == null) {
			this.list = new List();
		}
		
		List current_list = this.list;
		
		for(int i = 0; i < word.length(); i++){
			Node new_node = current_list.find_or_insertEnd(same_word[i]);
			
			if (i == word.length() - 1) {
				new_node.makeEnd();
			}
			if (new_node.getNextList() == null) {
				new_node.setNextList(new List());
			}
			current_list = new_node.getNextList();
		}
	}
	
	public String displayLists(List list, String s){
		Node node = list.getHead();
		if (node.getNextList() == null) {
			return Character.toString(node.getLetter());
		}
		s = s + this.displayLists(node.getNextList(), s);
		
		return s;
	}
	
	private String displayWords(Node node, String s){
		
	}
	
	public String toString(){
		
	}
	
	private boolean search(Node node, String word, int position){
		
	}
	
	public void search(String word){
		
	}
}
