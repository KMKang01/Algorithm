import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split("");

		int lowerCount = 0;
		int upperCount = 0;
		int numberCount = 0;
		int specialCount = 0;
		for(String s: input)  {
			if(s.matches("[a-z]")) {
				lowerCount++;
			} else if(s.matches("[A-Z]")) {
				upperCount++;
			} else if(s.matches("[0-9]")) {
				numberCount++;
			} else if(s.matches("[!@#$%^&*()-+]")) {
				specialCount++;
			}
		}
		int requiredChar = 0;
		if(lowerCount < 1) {
			lowerCount++;
			requiredChar++;
		}
		if(upperCount < 1) {
			upperCount++;
			requiredChar++;
		}
		if(numberCount < 1) {
			numberCount++;
			requiredChar++;
		}
		if(specialCount < 1) {
			specialCount++;
			requiredChar++;
		}

		int length = lowerCount + upperCount + numberCount + specialCount;
		if(length < 6) {
			requiredChar += (6 - length);
		}
		System.out.println(requiredChar);
	}
}


