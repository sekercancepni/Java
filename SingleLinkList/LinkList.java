
public class LinkList {
	Student head;
	
	public LinkList(){
		head = null;
	}
	
	public Student getLastStudent() {
		Student temp = this.head;
		while (!this.isEmpty() && temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(Student student) {
		if (this.isEmpty()) {
			head = student;
		} else {
			Student last_student = this.getLastStudent();
			last_student.next = student;
		}
	}
	
	public Student searchName(String name) {
		Student temp = this.head;
		while (!this.isEmpty() && temp.next != null) {
			if (temp.name.equals(name)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public Student remove(String name){
		Student temp = this.head;
		Student prev = null;
		
		while(!isEmpty() && !temp.name.equals(name)){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null){
			return null;
		}
		
		if(!head.name.equals(name)){
			prev.next = temp.next;
		}else{
			head = head.next;
		}
		temp.next = null;
		return temp;
	}

}

