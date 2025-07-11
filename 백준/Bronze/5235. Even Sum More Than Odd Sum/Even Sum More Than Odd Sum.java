import java.util.Scanner;

public class Main {

    private static int checkEvenSumMoreThanOddSum(int[] sequence) {

        /* Return value (ret) should be set to 1 if the sum of even numbers 
         * is larger than the sum of odd numbers in the sequence,
         * to -1 if the reverse is true, and to 0 if the two sums are identical */
        int ret = 0;

        /* ------------------- INSERT CODE HERE ---------------------*/
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i< sequence.length; i++) {
            if(sequence[i] % 2 == 0) evenSum += sequence[i];
            else oddSum += sequence[i];
        }
        if(oddSum < evenSum) ret = 1;
        else if (oddSum > evenSum) ret = -1;
        else ret = 0;
        /* -------------------- END OF INSERTION --------------------*/
        return ret;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int lengthOfSequence = sc.nextInt();

            int [] sequence = new int[lengthOfSequence];

            for(int j = 0; j < lengthOfSequence; j++) {
                sequence[j] = sc.nextInt();
            }

            int res = checkEvenSumMoreThanOddSum(sequence);
            if(res > 0) {
                System.out.println("EVEN");
            } else {
                if(res < 0) {
                    System.out.println("ODD");
                } else {
                    System.out.println("TIE");
                }
            }
        }
    }
}
