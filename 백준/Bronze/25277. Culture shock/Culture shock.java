import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split(" ");
		int count = 0;

		for(String str : input){
			if(str.equals("she")
					|| str.equals("her")
					|| str.equals("he")
					|| str.equals("him")
			){
				count++;
			}
		}

		System.out.println(count);
	}
}

