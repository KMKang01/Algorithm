import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split("");
		int [] alphabet = new int [26];
		for (int i = 0; i < line.length; i++) {
			alphabet[line[i].charAt(0) - 'a']++;
		}

		int oddFlag = 0;
		int evenFlag = 0;

		for(int i : alphabet) {
			if (i == 0) continue;
			if(i % 2 == 0) {
				evenFlag++;
			} else {
				oddFlag++;
			}
		}

		if(evenFlag == 0) {
			System.out.println(1);
		} else if(oddFlag == 0) {
			System.out.println(0);
		} else if (evenFlag > 0 && oddFlag > 0) {
			System.out.println("0/1");
		}


	}
}

