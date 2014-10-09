import java.util.Scanner;


public class Euler003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        long[] max = new long[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextLong();
        }
        for(int i=0;i<count;i++){
            
        	System.out.println(primefactor(max[i]));
        }
        
        in.close();
	}

	
		
		public static long primefactor(long n)
		{
			long bigfactor = n;
			long smallfactor =1;

			long i;
			long factor;
			if (Math.abs(n)<=1){
				return n;
			}
			if(n % 2 == 0)
			{
				factor = 2;
				 while (n % factor == 0){
					 n = n/factor;
					 smallfactor = factor;
						bigfactor =n;
				 }
			}
			if(n % 3 == 0)
			{
				factor = 3;
				while (n % factor == 0){
				n = n/factor ;
				smallfactor = factor;
				bigfactor =n;
				}
			}

			factor = 5;
			long count = 0;
			
			
			while(Math.sqrt(n) > factor)  
			{    
				while (n % factor == 0){
				n /= factor ;
				smallfactor = factor;
				bigfactor =n;
				}
				factor += (2 + 2*(count % 2));
				count++;
			}   
			if(bigfactor > smallfactor){
			return bigfactor;
			}
			else{
				return smallfactor;
			}
		}

		
}
