
public class DLinkListApp {
	public static void main(String[] args){
		DLinkList numbers = new DLinkList();
		
		numbers.addLast(10);
		numbers.addLast(11);
		numbers.addLast(12);
		numbers.addLast(13);
		numbers.addLast(14);
		numbers.addLast(15);
		numbers.addLast(16);
		numbers.write();
		
		
		System.out.println("------");
		numbers.deleteFirst();
		numbers.write();
		
		numbers.deleteFirst();
		numbers.write();
		
		numbers.deleteLast();
		numbers.write();
		

		numbers.deleteLast();
		numbers.write();

		numbers.deleteLast();
		numbers.write();
		

		numbers.deleteLast();
		numbers.write();

		numbers.deleteLast();
		numbers.write();

		numbers.deleteLast();
		numbers.write();
	}
}	
