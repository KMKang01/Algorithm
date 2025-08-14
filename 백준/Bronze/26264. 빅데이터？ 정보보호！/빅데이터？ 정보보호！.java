import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String [] line = br.readLine().split("");

		int i = 0;
		int sCount = 0;
		int bCount = 0;

		for (; i < line.length ; ) {
			if(line[i].equals("s")) {
				sCount++;
				i+=8;
			} else if(line[i].equals("b")) {
				bCount++;
				i+=7;
			}
		}

		if(sCount == bCount) {
			System.out.println("bigdata? security!");
		} else if (sCount > bCount) {
			System.out.println("security!");
		} else {
			System.out.println("bigdata?");
		}
	}
}
