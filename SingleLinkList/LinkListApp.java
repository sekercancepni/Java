
public class LinkListApp {
	public static void main(String[] args){
		
		LinkList students = new LinkList();
		
		Student new_student1 = new Student("Can", 21);
		Student new_student2 = new Student("Ali", 20);
		Student new_student3 = new Student("Mehmet", 19);
		Student new_student4 = new Student("Serdar", 29);
		
		students.add(new_student1);
		students.add(new_student2);
		students.add(new_student3);
		students.add(new_student4);
		
		System.out.println(students.head.next.name);
		
		students.remove("Can");
		
		System.out.println(students.head.name);
		
		students.add(new_student1);
		
		System.out.println(students.getLastStudent().age);
		
		
	}
}
