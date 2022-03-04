// import java.util.Scanner; 


//       public class GFG.java
// {

//     static final int ASCII_SIZE = 256;

//     static char getMaxOccurringChar(String str)

//     {


//         int count[] = new int[ASCII_SIZE];

   

//         // string.

//         int len = str.length();

//         for (int i=0; i<len; i++)

//             count[str.charAt(i)]++;

      

//         int max = -1;  // Initialize max count

//         char result = ' ';   // Initialize result

      

//         // Traversing through the string and maintaining

//         // the count of each character

//         for (int i = 0; i < len; i++) {

//             if (max < count[str.charAt(i)]) {

//                 max = count[str.charAt(i)];

//                 result = str.charAt(i);

//             }

//         }

      

//         return result;

//     }

     

//     // Driver Method

//     public static void main(String[] args)

//     {

//         String str = "sample string";

//         System.out.println("17 z " +

//                             getMaxOccuringChar(str));

//     }
// }


// Reference the below code segment.

     String inputString = scnr.nextLine();

		int i, cnt;
		char max_char;
		i = 0;
		cnt = 0;
		max_char = ' ';

		inputString = inputString.toLowerCase();
		while (i < inputString.length()) {
			if (Character.isLetter(inputString.charAt(i))) {
				if (max_char < inputString.charAt(i))
					max_char = inputString.charAt(i);
				cnt++;
			}
			i++;
		}
		System.out.printf("%d\t%c\n", cnt, Character.toUpperCase(max_char));
		scnr.close(); 
      