import java.util.Scanner;


public class Euler002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        long[] max = new long[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextLong();
        }
        for(int i=0;i<count;i++){
            
        	eulerSum(max[i]);
        }
        
        in.close();
	}
	public static void eulerSum(long max){
		
		long last =0;
		long current=1;
		long sum=0;
		while(current<max){
			if(current %2 ==0){
				sum += current;
				
			}
			
			long temp = last+current;
			last = current;
			current=temp;
		}
		System.out.println(sum);
	}

}
