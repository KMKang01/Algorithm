import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split("");

		String prev = null;
		for(String s: line) {
			if(prev == null) {
				sb.append(s);
				prev = s;
			} else {
				if(!s.equals(prev)) {
					sb.append(s);
					prev = s;
				}
			}
		}
		System.out.println(sb.toString());



	}

}


