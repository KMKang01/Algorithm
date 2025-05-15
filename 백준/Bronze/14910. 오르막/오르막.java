import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] s1 = br.readLine().split(" ");
		int prev = Integer.parseInt(s1[0]);
		boolean isRight = true;
		for (int i = 0; i < s1.length; i++) {
			if(Integer.parseInt(s1[i]) < prev ) {
				isRight = false;
				break;
			} else {
				prev = Integer.parseInt(s1[i]);
			}
		}

		if(isRight) System.out.println("Good");
		else System.out.println("Bad");
	}
}
