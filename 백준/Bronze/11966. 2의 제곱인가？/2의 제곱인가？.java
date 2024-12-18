import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 31 ; i++) {
			arr.add((int)Math.pow(2, i));
		}

		if(arr.contains(N)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}



	}
}