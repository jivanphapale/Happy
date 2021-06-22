package Abcd;



      public class Class {

	public static void main(String[] args) {
		
		// To Find armstrong Number
		
		int a;
		int c=0;
		int num=153;
		int j=num;
		
		
		while(num!=0) 
		{
			a=num%10;
			c=c+(a*a*a);
			
			num=num/10;	
		}
		
         if(c==j) {
        	 
            System.out.println("Armstrong Number");
         }
		
         else {
        	 
        	 System.out.println("Not Armstrong Number");
         }
		
	}

	}

