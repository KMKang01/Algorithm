import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i = Integer.parseInt(br.readLine());
		while(i != 0) {
			String [] line = br.readLine().split(" ");
			int mary = 0;
			int john = 0;

			for(String s :line){
				if(s.equals("0")) {
					mary++;
				} else  {
					john++;
				}
			}
			sb.append("Mary won ").append(mary).append(" times and John won ").append(john).append(" times\n");

			i = Integer.parseInt(br.readLine());
		}

		System.out.print(sb.toString().trim());
	}
}