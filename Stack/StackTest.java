
public class StackTest {

    
    public static void main(String[] args) {
        /*
        Stack s = new Stack(10);
        
        try {
           // s.pop();
            s.push(10);
            s.push(21);
            s.push(12);
            s.push(24);
            
           int del = s.pop();
           System.out.println(del);
           
           int e = s.top();
           System.out.println(e);
           
           s.push(35);
           e = s.top();
           System.out.println(e);
           s.push(11);
           s.push(32);
           
        } catch (EmptyStackException ex) {
           ex.printStackTrace();
        } catch (FullStackException ex) {
            ex.printStackTrace();
        }
        */
    	// String expr = "812./";
    	// int result = postfixEvaluate(expr);
    	
    	String expr = "352+-";
    	System.out.println(postfixEvaluate(expr));
    	
    }
    
    public static int postfixEvaluate(String ex) {
    	Stack stack = new Stack(ex.length());
    	try{
    		for(int i=0; i < ex.length(); i++) {
	    		String ch = ex.substring(i, i+1);
	    		
	    		if(Character.isDigit(ch.charAt(0))){
	    			int value = Character.getNumericValue(ch.charAt(0));
	    			stack.push(value);
	    		} else {
    				int arg1 = stack.pop();
		    		int arg2 = stack.pop();
		    		int result = 0;
		    		
		    		if (ch.equals("+")) {
		    			result = arg1 + arg2;
		    		} else if (ch.equals("-")) {
		    			result = arg2 - arg1;
		    		} else if (ch.equals("*")) {
		    			result = arg2 * arg1;
		    		} else if (ch.equals("/")) {
		    			result = arg2 / arg1;
		    		} else {
		    			System.out.println("Undefined Character: " + ch);
		    		}
		    		
		    		stack.push(result);
		    	}
    		}
    		if (stack.size() == 1) {
        		return stack.pop();
        	} else {
        		System.out.println("Undefined expression");
        	}
    	
    	} catch(FullStackException exception) {
			
		} catch(EmptyStackException exception) {
			System.out.println("Undefined expersion.");
		} 
    	return 0;
    }
    
    public static boolean checkParentheses(String expr) {
    	StackStr stack = new StackStr(expr.length());
    	try{
	    	for (int i = 0; i < expr.length(); i++) {
	    		String ch = expr.substring(i, i+1);
	    		if (ch.equals("(") || ch.equals("[") || ch.equals("{")) {
	    			stack.push(ch);
	    		} else if (ch.equals(")") || ch.equals("]") || ch.equals("}")){
	    			String ch_in_stack = stack.pop();
	    			if ((ch_in_stack.equals("(") && !ch.equals(")")) || 
	    				(ch_in_stack.equals("[") && !ch.equals("]")) ||
	    				(ch_in_stack.equals("{") && !ch.equals("}"))) {
	    				return false;
	    			}
	    		} else {
	    			return false;
	    		}
	    	}
    	} catch (FullStackException exception) {
    		return false;
    	} catch (EmptyStackException exception) {
    		return false;
    	}
    	
    	return stack.isEmpty();
    }
    
}
