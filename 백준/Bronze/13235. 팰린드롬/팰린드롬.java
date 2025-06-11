import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int i = input.length() / 2;
		boolean isPalindrome = true;

		if(input.length() % 2 == 0) {
			if(input.substring(0, i).equals(new StringBuilder(input.substring(i)).reverse().toString())) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		} else {
			if (input.substring(0, i).equals(new StringBuilder(input.substring(i + 1)).reverse().toString())) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		if (isPalindrome) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}


