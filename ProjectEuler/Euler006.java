import java.util.Scanner;


public class Euler006 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        long[] max = new long[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextLong();
        }
        for(int i=0;i<count;i++){
        	System.out.println(squareDifference(max[i]));
        }
        in.close();
	}
	
	
	public static long squareDifference(long input){
		long sum1 =0;
		long sum2 =0;
		
		for (long i=0;i<=input;i++){
			sum1 += i*i;
			sum2 += i;
			
			
		}
		sum2 = sum2*sum2;
		
		return (sum2 - sum1);
		
	}
}




