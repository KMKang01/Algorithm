import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int k1 = sc.nextInt();
		int n2 = sc.nextInt();
		int k2 = sc.nextInt();
		System.out.println(n1 * k1 + n2 * k2);
	}
}
