package mentorClassRoomassessment;

public class Amstrongnumber {
	/***
	 * 
	 * given number is int
	 * find the modulo of given number
	 * reminder multiple from 3 time then store in to one variable
	 * then given number divided and and the number assign to next iteration
	 * 
	 * 
	 * @param args
	 */
    public static void main(String[] args)
    {
        int n = 153;
        int temp = n;
        int p = 0;
 
        // Function to calculate the sum of
        // individual digits
        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
 
        // Condition to check whether the value
        // of P equals to user input or not.
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
}


