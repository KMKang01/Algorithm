import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");

		int rejectCount = 0;
		int acceptCount = 0;
		int noCount = 0;
		for (int i = 0; i < N; i++) {
			switch (line[i]) {
				case "0":
					noCount++;
					break;
				case "1":
					acceptCount++;
					break;
				case "-1":
					rejectCount++;
					break;
			}
		}

		if (noCount >=(int) Math.ceil((double) N / 2)) {
			System.out.println("INVALID");
		} else {
			if (rejectCount >= acceptCount) {
				System.out.println("REJECTED");
			} else {
				System.out.println("APPROVED");
			}
		}

	}
}