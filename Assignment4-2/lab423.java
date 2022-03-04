import java.util.Scanner;

public class LabProgram {
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                int max = -1 , count = 0 , sum=0;
                
                while(true) {
                        int value = sc.nextInt();
                        if(value<0)
                                break;
                        count++;
                        sum += value;
                        if(value > max)
                                max = value;
					// Find the min also.
					
                }

				// Before getting the average,
			// Subtract min and max from the sum first.
			
			
                double average = (float)sum/(float)count;
                
				System.out.print(max + " ");
				// Instead of printing the max
				// Print "sum"
			
			
                System.out.printf("%.2f\n",average);    
        }
}      
      
      
   