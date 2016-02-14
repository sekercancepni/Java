
public class test {
	public static void main(String[] args){
		Queue q = new Queue(10);
		
		q.enqueue(19);
		q.enqueue(2);
		q.enqueue(13);
		q.enqueue(15);

		q.dequeue();
		
		q.write();
		
		
		
	}
}	
