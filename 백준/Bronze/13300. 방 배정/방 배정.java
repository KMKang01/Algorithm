import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] condition = br.readLine().split(" ");
		int N = Integer.parseInt(condition[0]);
		int K = Integer.parseInt(condition[1]);

		int roomCount = 0;
		int[][] students = new int[2][6];

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			int sex = Integer.parseInt(line[0]);
			int grade = Integer.parseInt(line[1]) - 1;
			students[sex][grade]++;
		}

		for (int[] student : students) {
			for (int i : student) {
				roomCount += (int) Math.ceil((double) i / K);
			}
		}

		System.out.println(roomCount);
	}
}