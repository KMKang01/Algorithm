import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split("");
		int bCount = 0; // 1
		int rCount = 0; // 2
		int oCount = 0; // 1
		int nCount = 0; // 1
		int zCount = 0; // 1
		int eCount = 0; // 2
		int sCount = 0; // 1
		int iCount = 0; // 1
		int lCount = 0; // 1
		int vCount = 0; // 1

		for(String s : input) {
			switch (s) {
				case "B":
					bCount++;
					break;
				case "R":
					rCount++;
					break;
				case "O":
					oCount++;
					break;
				case "N":
					nCount++;
					break;
				case "Z":
					zCount++;
					break;
				case "E":
					eCount++;
					break;
				case "S":
					sCount++;
					break;
				case "I":
					iCount++;
					break;
				case "L":
					lCount++;
					break;
				case "V":
					vCount++;
					break;
			}
		}
		int total = 0;
		while( bCount > 0 && rCount > 0 && oCount > 0 && nCount > 0 && zCount > 0 && eCount > 1 && sCount > 0 && iCount > 0 && lCount > 0 && vCount > 0) {
			bCount--;
			rCount-= 2;
			oCount--;
			nCount--;
			zCount--;
			eCount -= 2;
			sCount--;
			iCount--;
			lCount--;
			vCount--;
			total++;
		}
		System.out.println(total);
	}
}


