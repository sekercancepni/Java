public class FullStackException extends Exception{
    private String message;
    
    public FullStackException(){
        this.message = "Stack is full";
    }
    
    public FullStackException(String message){
        this.message = message;
    }
    
    @Override
    public String toString(){
        return this.message;
    }
}
