import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		boolean flag = false;

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			switch (line[0]) {
				case "1":
					count += Integer.parseInt(line[1]);
					break;
				case "2":
					if (count < Integer.parseInt(line[1])) {
						flag = true;
						break;
					} else {
						count -= Integer.parseInt(line[1]);
					}
			}
		}

		if (flag) {
			System.out.println("Adios");
		} else {
			System.out.println("See you next month");
		}

	}
}
