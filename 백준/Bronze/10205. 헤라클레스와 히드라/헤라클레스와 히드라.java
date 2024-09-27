import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			int h = Integer.parseInt(br.readLine());
			String [] dataSet = br.readLine().split("");
			for(String s: dataSet){
				if(s.equals("b")){
					h--;
				} else if(s.equals("c")){
					h++;
				}
			}
			sb.append("Data Set ").append(i+1).append(":\n").append(h).append("\n\n");
		}

		System.out.println(sb.toString().trim());
	}
}