import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		char firstChar = line.charAt(0);
		int count = 1;

		for(int i = 1; i < line.length(); i++){
			if(line.charAt(i) == firstChar){
				count++;
			} else {
				break;
			}
		}

		System.out.println(count);
	}
}