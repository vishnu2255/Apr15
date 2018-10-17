package Test;

public class Stack {

	 long[] arr = new long[10];
     int top=-1;
     
	public void push(Long i)
	{
		if(arr.length<=10)
		{
			top++;
			arr[top]=i;
		}
	}
			
	 public Long pop() {
		 
		 if(top>=0)
		 { 			 
			 return arr[top--];					
		 }
		 else
		 {
			 throw new UnsupportedOperationException();
		 }
		 
//	        throw new UnsupportedOperationException();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
       // stack.push(5L);
        System.out.println(stack.pop());
        
       
        
	}
	
	

}
