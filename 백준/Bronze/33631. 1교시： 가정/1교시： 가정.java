import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] input1 = br.readLine().split(" ");
		String [] input2 = br.readLine().split(" ");

		int myFlour = Integer.parseInt(input1[0]);
		int myChocolate = Integer.parseInt(input1[1]);
		int myEggs = Integer.parseInt(input1[2]);
		int myButter = Integer.parseInt(input1[3]);

		int requiredFlour = Integer.parseInt(input2[0]);
		int requiredChocolate = Integer.parseInt(input2[1]);
		int requiredEggs = Integer.parseInt(input2[2]);
		int requiredButter = Integer.parseInt(input2[3]);
		
		int cookies = 0;
		
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String [] query = br.readLine().split(" ");
			int cmd = Integer.parseInt(query[1]);
			switch(query[0]){
				case "1":
					if(
							myFlour >= requiredFlour * cmd &&
							myChocolate >= requiredChocolate * cmd &&
							myEggs >= requiredEggs * cmd &&
							myButter >= requiredButter * cmd
					) {
						myFlour -= requiredFlour * cmd;
						myChocolate -= requiredChocolate * cmd;
						myEggs -= requiredEggs * cmd;
						myButter -= requiredButter * cmd;
						cookies += cmd;
						sb.append(cookies).append("\n");
					} else {
						sb.append("Hello, siumii\n");
					}
					break;
				case "2":
					myFlour += cmd;
					sb.append(myFlour).append("\n");
					break;
				case "3":
					myChocolate += cmd;
					sb.append(myChocolate).append("\n");
					break;
				case "4":
					myEggs += cmd;
					sb.append(myEggs).append("\n");
					break;
				case "5":
					myButter += cmd;
					sb.append(myButter).append("\n");
					break;
			}
		}
		System.out.println(sb.toString().trim());
	}
}
