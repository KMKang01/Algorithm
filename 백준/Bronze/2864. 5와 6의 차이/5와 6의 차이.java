import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = 0;
		int min = 0;

		String [] line = br.readLine().split(" ");

		int minA = Integer.parseInt(line[0].replaceAll("6", "5" ));
		int maxA = Integer.parseInt(line[0].replaceAll("5", "6" ));
		int minB = Integer.parseInt(line[1].replaceAll("6", "5" ));
		int maxB = Integer.parseInt(line[1].replaceAll("5", "6" ));
		min = minA + minB;
		max = maxA + maxB;

		System.out.println(min+ " " + max);
	}
}


