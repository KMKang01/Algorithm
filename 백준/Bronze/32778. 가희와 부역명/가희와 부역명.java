import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		String[] arr = line.split("\\(");

		String origin;
		String sub;
		if (arr.length == 1) {
			origin = arr[0];
			sub = null;
		} else {
			origin = arr[0];
			sub = arr[1];
		}


		if (sub == null) {
			System.out.println(origin);
			System.out.println("-");
		} else {
			System.out.println(origin);
			System.out.println(sub.substring(0, sub.length() - 1));
		}


	}
}