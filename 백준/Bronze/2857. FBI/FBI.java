import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();

		String [] agents = new String[5];
		for (int i = 0; i < 5; i++) {
			agents[i] = br.readLine();
		}
		for(int i = 0; i < agents.length; i++) {
			if(agents[i].contains("FBI")) sb.append(i+1).append(" ");
		}

		if(sb.toString().equals("")) System.out.println("HE GOT AWAY!");
		else System.out.println(sb.toString());


	}
}
