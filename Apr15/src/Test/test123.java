package Test;

public class test123 {

	 public static char[] reverseArray(char[] array) {
         char[] rev = new char[array.length];
		 int j=0;
		 for(int i=array.length-1;i>=0;i--)
		 {
			 rev[j]=array[i];
			 j++;
		 }
        return rev;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] input = {'H','e','l','l','o'};
//        System.out.println(reverseArray(input));
		
		System.out.println("test");
	}

}
