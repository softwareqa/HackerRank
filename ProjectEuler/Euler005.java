import java.util.Scanner;


public class Euler005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] max = new int[count];
        for(int i=0;i<count;i++){
            
        	max[i]=in.nextInt();
        }
        for(int i=0;i<count;i++){
        	System.out.println(smallestMultiple(max[i]));
        }
        in.close();
	}
	public static Integer smallestMultiple(int max){
		int count =0;
		
	while(true){
		count +=max;
		boolean foundMultiple = true;
		for(int i=max;i>0;i--){
			if (count % i !=0){
				foundMultiple =false;
			}
			
		}
		if(foundMultiple){
			
			return count;
		}
		
	}

		
		
	}

}





