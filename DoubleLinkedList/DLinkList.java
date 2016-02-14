
public class DLinkList {
	Node head;
	Node tail;
	
	public DLinkList(){
		head = tail = null;
	}
	
	public void addFirst(int iData){
		Node temp = new Node(iData);
		if(head == null && tail == null){
			head = temp;
			tail = temp;
		} else {
			head.prev = temp;
			temp.next = head;
			head = temp;
		}
	}
	
	public void addLast(int iData){
		if (head == null) {
			this.addFirst(iData);
		} else {
			Node temp = new Node(iData);
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	public Node deleteFirst(){
		Node deleted = head;
		if (head != null) {
			head = head.next;
		}
		if (head == null) {
			tail = null;
		}
		return deleted;
 	}
	
	public Node deleteLast(){
		Node deleted = tail;
		if (tail != null) {
			tail = tail.prev;
			
			if (tail != null) {
				tail.next = null;
			}
		}
		if (tail == null) {
			head = null;
		}
		return deleted;
	}
	
	public Node delete(int del){
		Node deleted = head;
		while(deleted != null && deleted.iData != del){
			deleted = deleted.next;
		}
		if(deleted.iData == del){
			if(deleted.next == null){
				(deleted.prev).next = deleted.next;
		        tail = tail.prev;
		        deleted.prev = null;
			}
			if(deleted.prev == null){
				(deleted.next).prev = deleted.prev;
		        head = head.next;
		        deleted.next = null;
			}
			if(deleted.next != null && deleted.prev != null){
				(deleted.prev).next = deleted.next;
				(deleted.next).prev = deleted.prev;
			    deleted.next = deleted.prev = null;
			}
		}
		return deleted;
	}
	
	public void write(){
		Node temp = head;
		if (head == null) {
			System.out.println("Bos");
		} else {
			while(temp.next != null){
				System.out.print(temp.iData + " ");
				temp = temp.next;
			}
			System.out.print(temp.iData + " ");
			System.out.println();
		}
	}
}
