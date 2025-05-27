import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split("");

		int hCount = 0;
		int iCount = 0;
		int aCount = 0;
		int rCount = 0;
		int cCount = 0;

		for (String s : line) {
			switch (s) {
				case "A":
					aCount++;
					break;
				case "R":
					rCount++;
					break;
				case "C":
					cCount++;
					break;
				case "H":
					hCount++;
					break;
				case "I":
					iCount++;
					break;
			}
		}

		int completeCount = 0;
		while(aCount > 0 && rCount > 0 && cCount > 0 && hCount > 0 && iCount > 0) {
			aCount--;
			iCount--;
			rCount--;
			hCount--;
			cCount--;
			completeCount++;
		}

		System.out.println(completeCount);
	}
}

