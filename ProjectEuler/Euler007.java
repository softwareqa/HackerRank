import java.util.Scanner;


public class Euler007 {

	public static int input = 10000000;
	
	// initially assume all integers are prime
    public static boolean[] isPrime = new boolean[input+1 ];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for (int i = 2; i <= input; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i*i <= input; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= input; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
		
		
		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] max = new int[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextInt();
        }
        for(int i=0;i<count;i++){
        	System.out.println(primeCount(max[i]));
        }
        in.close();
	}
	
	
	public static long primeCount(int count){

		

        // count primes

        int highest =0;
        int counter =0;
        for (int i = 2; i <= input; i++) {
            if (isPrime[i]) {
            	counter++;
            }
            if(counter == count){
            	return i;
            	
            }
        }
        return highest;
	}
	
}
