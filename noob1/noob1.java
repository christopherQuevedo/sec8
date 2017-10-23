public class noob1{
	
	public static void mirrorSequence(int n){
	    if(n < 1){
	        throw new IllegalArgumentException();
	    }
	    else if(n == 2){
	    	System.out.print("1 1");
	    }
	    else if(n == 1){
	    	System.out.print("1");
	    }
	    else if(n % 2 == 0){
	    	System.out.print(n/2 + " ");
	    	mirrorSequence(n - 2);
	    	System.out.print(" " + n/2);
	    }
	    else{
	    	System.out.print(n/2+1 + " ");
	    	mirrorSequence(n - 2);
	    	System.out.print(" " + n/2+1);
	    }
	    
	}
	
	public static void main(String[] args) {
		mirrorSequence(5);
		
		
	}
}