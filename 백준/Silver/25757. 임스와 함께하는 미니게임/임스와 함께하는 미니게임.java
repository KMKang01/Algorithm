import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		String game = input[1];
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		ArrayList<String> list = new ArrayList<>();
		list.addAll(set);
		int count = 0;
		if(game.equals("Y")){
			count = list.size();
		} else if(game.equals("F")){
			count = list.size() / 2;
		} else if(game.equals("O")){
			count = list.size() / 3;
		}

		System.out.println(count);
	}
}

