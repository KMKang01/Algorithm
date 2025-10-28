import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] meetings = new int[N][2];

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			meetings[i][0] = Integer.parseInt(line[0]);
			meetings[i][1] = Integer.parseInt(line[1]);
		}

		Arrays.sort(meetings, (a, b) -> {
			if (a[1] == b[1])
				return Integer.compare(a[0], b[0]);
			return Integer.compare(a[1], b[1]);
		});

		int count = 0;
		int end = 0;
		for (int i = 0; i < N; i++) {
			if (meetings[i][0] >= end) {
				end = meetings[i][1];
				count++;
			}
		}

		System.out.println(count);
	}
}
