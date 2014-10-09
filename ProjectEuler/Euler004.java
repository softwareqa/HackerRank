import java.util.Scanner;


public class Euler004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] max = new int[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextInt();
        }
        for(int i=0;i<count;i++){
        	System.out.println(largestPalindrome(max[i]));
        }
        in.close();
	}
	
	public static int largestPalindrome(int input){
		//I need to find 2 numbers
		int highest = 0;
		for (int i =999; i>0;i--){
			for(int j = 999; j>0;j--){
				int result = i*j;
				if(result <= input){
					if(isPalindrome(result)){
						if(result >highest){
							
							highest = result;
						}
						
					}
					
				}
				
				
			}
			
			
		}
		//must be larger then 2*sqrt 2
		return highest;
	}
	public static boolean isPalindrome(int input){
		Integer[] returnValues = new Integer[6];
		returnValues[0] = input / 100000;
		returnValues[1] = input /10000%10;
		returnValues[2] = input /1000 %10;
		returnValues[3] = input /100 %10;
		returnValues[4] = input /10 %10;
		returnValues[5] = input %10;
		
		if((returnValues[0] == returnValues[5]) && (returnValues[1] == returnValues[4]) && (returnValues[2] == returnValues[3])){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static Integer[] splitInt (int input){
		Integer[] returnValues = new Integer[6];
		returnValues[0] = input / 100000;
		returnValues[1] = input /10000%10;
		returnValues[2] = input /1000 %10;
		returnValues[3] = input /100 %10;
		returnValues[4] = input /10 %10;
		returnValues[5] = input %10;
		return returnValues;
	}
	
}
