public class EmptyStackException extends Exception {
    
    private String message;
    
    public EmptyStackException(){
        this.message = "Stack is empty";
    }
    
    public EmptyStackException(String message){
        this.message = message;
    }
    
    @Override
    public String toString(){
        return this.message;
    }
}
