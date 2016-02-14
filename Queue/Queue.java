
public class Queue {
	public int maxsize;
	private int end;
	private int front;
	private int[] array;
	private int size;
	
	public Queue(int maxsize){
		this.maxsize = maxsize;
		this.array = new int[maxsize];
		this.end = -1;
		this.front = 0;
		this.size = 0;
	}
	
	public void enqueue(int number){
		end = (end+1) % maxsize;
		array[end] = number;
		size++;
	}
	
	public int dequeue(){
		int temp = array[front];
		front = (front+1) % maxsize;
		size--;
		return temp;
	}
	
	public int firstElem(){
		return array[front];
	}
	
	public void write(){
		for(int i=front;i<=size;i++){
			System.out.print(array[i] + "  ");
		}
	}
}
