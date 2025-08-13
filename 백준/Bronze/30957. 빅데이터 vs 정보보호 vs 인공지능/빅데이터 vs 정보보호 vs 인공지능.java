import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split("");

		int aCount = 0;
		int bCount = 0;
		int sCount = 0;

		for (String ch : input) {
			if (ch.equals("A")) {
				aCount++;
			} else if (ch.equals("B")) {
				bCount++;
			} else if (ch.equals("S")) {
				sCount++;
			}
		}

		if(aCount == bCount && bCount == sCount) {
			System.out.println("SCU");
		} else if (aCount > bCount && aCount > sCount) {
			System.out.println("A");
		} else if (bCount > aCount && bCount > sCount) {
			System.out.println("B");
		} else if (sCount > aCount && sCount > bCount) {
			System.out.println("S");
		} else if(aCount == bCount && aCount > sCount) {
			System.out.println("BA");
		} else if (sCount == aCount && sCount > bCount) {
			System.out.println("SA");
		} else if (bCount == sCount && bCount > aCount) {
			System.out.println("BS");
		}

	}
}
