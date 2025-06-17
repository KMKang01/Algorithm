import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		String s = br.readLine();
		int count = 0;
		for(String str : input) {
			if(!str.equals(s) && str.length() > s.length()){
				str = str.substring(0, s.length());
				if(str.equals(s)) count++;
			}


		}
		System.out.println(count);
	}
}


