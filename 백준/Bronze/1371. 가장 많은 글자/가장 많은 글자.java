import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count [] = new int [26];

		String line = br.readLine();
		while(line != null){
			for(String ch : line.split("")){
				if(ch.matches("[a-z]")){
					count[ch.charAt(0)-'a']++;
				}
			}
			line = br.readLine();
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}

		for (int i = 0; i < count.length; i++) {
			if(count[i] == max){
				sb.append((char)(i+'a'));
			}
		}
		System.out.println(sb.toString());
	}
}
