import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int[] score = new int[]{100, 100, 200, 200, 300, 300, 400, 400, 500};
		boolean isHacker = false;
		int sum = 0;
		for (int i = 0; i < line.length; i++) {
			int num = Integer.parseInt(line[i]);
			if(num > score[i]) {
				isHacker = true;
				break;
			} else {
				sum += num;
			}
		}

		if(isHacker) {
			System.out.println("hacker");
		} else {
			if(sum >= 100) System.out.println("draw");
			else System.out.println("none");
		}
	}
}

