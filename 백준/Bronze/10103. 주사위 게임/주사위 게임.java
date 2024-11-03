import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int changyeong = 100;
		int sangduck = 100;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i <N ; i++) {
			String[] line  = br.readLine().split(" ");
			if(Integer.parseInt(line[0]) > Integer.parseInt(line[1])) {
				sangduck -= Integer.parseInt(line[0]);
			} else if (Integer.parseInt(line[0]) < Integer.parseInt(line[1])) {
				changyeong -= Integer.parseInt(line[1]);
			}
		}

		System.out.printf("%d\n%d", changyeong, sangduck);




	}
}