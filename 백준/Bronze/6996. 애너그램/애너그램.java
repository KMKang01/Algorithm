import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        if(first.length() != second.length()) return false;
        
        ArrayList<String> firstSplitList = new ArrayList<>();
        for(String c: first.split("")){
            firstSplitList.add(c);
        }
        
        for(String c: second.split("")){
            firstSplitList.remove(c);
        }

        return firstSplitList.size() == 0;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
