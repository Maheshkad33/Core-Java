package lab01;

public class Fibonnci {

	        static int a=0;
	        static int b=1;
	        static int c=0;
	     void fibnum(int i){
	         if (i>=1){
	             c=a+b;
	             System.out.print(" " + c + " ");
	             a=b;
	             b=c;
	             fibnum(i-1);
	         }   
	     }
	        
//	    public void fibnumwithoutresc(int i)
//	    {
//	    	for(int j = 0;j<=i;j++) {
//	    		c=a+b;
//	    		 System.out.print(" " + c + " ");
//	    		 a=b;
//	    		 b=c;
//	    	}
//	    }
	        
	        
	    public static void main(String[] args) {
	      
	        System.out.print(a + " " + b + " ");
	        
	       Fibonnci f = new Fibonnci();
	        f.fibnum(10);
//	       f.fibnumwithoutresc(10);
	     }
	}

