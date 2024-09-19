import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String [] cheeses = br.readLine().split(" ");

		int count = 0;

		ArrayList<String> list = new ArrayList<>();

		for(String s: cheeses){
			if(s.length() >= 6){
				if (s.substring(s.length() - 6).equals("Cheese") && !list.contains(s)) {
					count++;
					list.add(s);
				}
			}

		}

		if(count >= 4) System.out.println("yummy");
		else System.out.println("sad");
	}
}