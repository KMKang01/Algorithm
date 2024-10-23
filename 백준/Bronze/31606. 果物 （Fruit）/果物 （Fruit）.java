import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int apple = Integer.parseInt(br.readLine());
		int mandarin = Integer.parseInt(br.readLine());
		System.out.println(apple + mandarin + 3);

	}
}
