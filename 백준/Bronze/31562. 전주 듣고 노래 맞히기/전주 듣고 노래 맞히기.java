import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

		int N = Integer.parseInt(line.split(" ")[0]);
		int M = Integer.parseInt(line.split(" ")[1]);

		LinkedList<String>[] list = new LinkedList[N];

		for (int i = 0; i < N; i++) {
			list[i] = new LinkedList<>();
		}

		for (int i = 0; i < N; i++) {
			String[] Song = br.readLine().split(" ");
			list[i].add(Song[2] + " " + Song[3] + " " + Song[4]);
			list[i].add(Song[1]);
		}

		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			String title ="";
			String code = input[0] + " " + input[1] + " " + input[2];
			int count = 0;
			for(LinkedList<String> ls: list){
				if(code.equals(ls.getFirst())) {
					count++;
					title = ls.getLast();
				}
			}

			if(count == 0) sb.append("!\n");
			else if (count == 1) sb.append(title).append("\n");
			else sb.append("?\n");
		}

		System.out.println(sb.toString().trim());
	}
}