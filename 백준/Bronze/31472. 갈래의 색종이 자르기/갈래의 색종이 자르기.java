import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int W = Integer.parseInt(br.readLine()); // h*h / 2 = W;

		int h = (int) Math.sqrt(2 * W);
		System.out.println(4 * h);

	}
}