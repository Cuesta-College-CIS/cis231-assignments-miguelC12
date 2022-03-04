import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
   int i, j, n, sum_int = 0;
    printf("Input a positive number less than 100: \n");
    scanf("%d", n);
    if (n < 1 || n >= 100) {
      printf("Wrong input\n");
      return 0;
    }
    j = 1;
    for (i = 1; j <= n; i++) {
      sum_int += j * j * j * j;
      j += i;
    }
    printf("Sum of the series is %d\n", sum_int);
    return 0;
  
// This program has diffrent code from the original 4.24 problem
// 

// Reference the below code segment 

	// while (true) {
// 			userInput = scnr.nextInt();
// 			if (sum + userInput > 100)
// 				break;
// 			sum += userInput;
// 			cnt++;
// 		}
// 		System.out.printf("%d\t%d\n", sum, cnt);
