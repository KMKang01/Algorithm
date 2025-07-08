import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		String answer = "";
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			if(line.equals(sb.append(line).reverse().toString())){
				answer = String.format("%d %s", line.length(), line.charAt(line.length() / 2));
				break;
			} else {
				sb.setLength(0);
				list.add(line);
			}
		}

		if(answer.isBlank()){
			for(int i = 0; i < list.size(); i++){
				String line = list.get(i);
				for (int j = i + 1; j < list.size() ; j++) {
					if(line.equals(sb.append(list.get(j)).reverse().toString())){
						answer = String.format("%d %s", line.length(), line.charAt(line.length() / 2));
						break;
					} else {
						sb.setLength(0);
					}
				}
				if(!answer.isBlank()){
					break;
				}
			}
		}

		System.out.println(answer);
	}
}


