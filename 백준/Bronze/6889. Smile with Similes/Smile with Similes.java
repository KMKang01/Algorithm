import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		String [] arr1 = new String [n];
		String [] arr2 = new String [m];
		for (int i = 0; i < n; i++) {
			arr1[i] = br.readLine();
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = br.readLine();
		}
		for(String s : arr1){
			for(String s2 : arr2){
				sb.append(s).append(" as ").append(s2).append("\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
}

