

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		int sum = 0;
		for(String num : input){
			sum += Integer.parseInt(num);
		}
		System.out.println(sum*5);
	}
}
