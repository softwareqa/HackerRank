import java.util.Scanner;


public class Euler001 {
    public static void main(String[] args) {
       
        
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        long[] max = new long[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextInt();
        }
        for(int i=0;i<count;i++){
            
        	eulerSum(max[i]);
        }
        
        in.close();
    }
    public static void eulerSum(long max){
    	long sum =0;
    	max = max-1;
    	long sum3 = 3*(max/3)*((max/3)+1);
    	long sum5 = 5*(max/5)*((max/5)+1);
    	long sum15 = 15*(max/15)*((max/15)+1);
    	sum = (sum3+sum5-sum15)/2;

    	System.out.println(sum);
    	
    	
    }
    
    
}
