package assign5;

public class RecursionAssignment {

	// Add Digits
	public static int addDigits(int number) {
		
		// If number is not 0
		if (number != 0) {
			return (addDigits(number / 10) + number % 10);
		}
		
		// When number is 0
		else {
			return 0;
		}
	}
	
	// Sum of all even numbers
	public static int sumEvenNumbers(int number) {
		
		// Less than or equal to 0
		if (number <= 0) {
			return 0;
		}
		
		// Even number sum
		if (number % 2 == 0) {
			int sum = number;
			int allnumbers = sumEvenNumbers(number-2);
			return (sum + allnumbers);
		}
		
		// Take odd number make it even and run method again
		else {
			return(sumEvenNumbers(number-1));
		}
		
	}
	
	public static int countVowels(String input) {
		
		// No word entered
        if(input.length() == 0) {
            return 0;
        }
        
        // Using ASCII table to see if vowels exist
        if((int)input.charAt(0) == 65 ||
         (int)input.charAt(0) == 69 ||
         (int)input.charAt(0) == 73 ||
         (int)input.charAt(0) == 79 ||
         (int)input.charAt(0) == 85 ||
         (int)input.charAt(0) == 97 ||
         (int)input.charAt(0) == 101 ||
         (int)input.charAt(0) == 105 ||
         (int)input.charAt(0) == 111 ||
         (int)input.charAt(0) == 117) {
        	
        	// if they do return sum and recursive step with startindex 1 and length of word
            int sum = 1;
            return(sum + countVowels(input.substring(1, input.length())));
        } 
        
        // when there are no vowels 
        else {
            return(countVowels(input.substring(1, input.length())));
        }
    }
	
	public static String removeVowels(String input) {
		
		// No word entered, or no vowels left
        if(input.length() == 0) {
            return "";
        }
        
        // // Using ASCII table to see if vowels exist
        if((int)input.charAt(0) == 65 ||
                (int)input.charAt(0) == 69 ||
                (int)input.charAt(0) == 73 ||
                (int)input.charAt(0) == 79 ||
                (int)input.charAt(0) == 85 ||
                (int)input.charAt(0) == 97 ||
                (int)input.charAt(0) == 101 ||
                (int)input.charAt(0) == 105 ||
                (int)input.charAt(0) == 111 ||
                (int)input.charAt(0) == 117) {
               	
               	// if they do exist, remove them and move forward based on the length of the word
        		return(removeVowels(input.substring(1, input.length())));
               }
        
        else {
        	
        	// If there are no vowels, keep that letter and move forward based on length of word
        	return(input.charAt(0) + removeVowels(input.substring(1, input.length())));
        }
        
        
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Using method addDigits with numbers 12345:");
		System.out.println(addDigits(12345));
		
		System.out.println("\nUsing method sumEvenNumbers with number 16:");
		System.out.println(sumEvenNumbers(16));
		
		System.out.println("\nUsing method countVowels with string Mississippi:");
		System.out.println(countVowels("Mississippi"));
		
		System.out.println("\nUsing method removeVowels with string HelloYou:");
		System.out.println(removeVowels("HelloYou"));
		

	}

}
