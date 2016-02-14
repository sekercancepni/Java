public class Stack {
    private int[] array;
    private int N;
    private int tos;
    
    public Stack(int N){
        this.N = N;
        array = new int[this.N];
        tos = -1;
    }
    
    public void print() {
    	for (int i=0; i < this.size(); i++) {
    		System.out.println(array[i]);
    	}
    }
    
    public int size(){
    	return this.tos +1;
    }
    
    public boolean isEmpty(){
    if(this.tos <0)
        return true;
    return false;
    }
    
    public int top() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
    return array[tos];
    }
    
    public void push(int e) throws FullStackException{
        if(size() == N)
            throw new FullStackException();
    array[tos+1] = e;
    tos++;
    
    }
    
    public int pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
    int del = array[tos];
    tos--;
    return del;
    }    
}