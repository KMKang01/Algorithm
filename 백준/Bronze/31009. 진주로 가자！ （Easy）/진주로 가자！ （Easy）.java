import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int remember = 0;

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			if (line[0].equals("jinju")) {
				remember = Integer.parseInt(line[1]);
			} else {
				list.add(Integer.parseInt(line[1]));
			}
		}

		int count = 0;
		for (int num : list) {
			if(remember < num) count++;
		}

		System.out.println(remember + "\n" + count);
	}
}
