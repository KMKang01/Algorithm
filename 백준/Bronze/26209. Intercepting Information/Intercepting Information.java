import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] input = br.readLine().split(" ");
		boolean isIntercepted = false;
		for (String s: input){
			if (s.equals("9")) {
				isIntercepted = true;
				break;
			}
		}
		if(isIntercepted){
			System.out.println("F");
		} else System.out.println("S");
	}
}
