import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int alpha = Integer.parseInt(br.readLine());

		double answer = (180 - alpha) / 2.0 + alpha / 2.0;
		System.out.println(Math.round(answer));
	}
}