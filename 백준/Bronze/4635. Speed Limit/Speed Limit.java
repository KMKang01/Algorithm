import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;
		while(!(line = br.readLine()).equals("-1")){
			int T = Integer.parseInt(line);
			int prev = -1;
			int dist = 0;
			for (int i = 0; i < T; i++) {
				String [] ln = br.readLine().split(" ");
				int speed = Integer.parseInt(ln[0]);
				int time = Integer.parseInt(ln[1]);
				if(prev == -1){
					dist += speed * time;
				} else {
					dist += speed * (time - prev);
				}
				prev = time;
			}
			sb.append(dist).append(" miles").append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
