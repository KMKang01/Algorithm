import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int D = Integer.parseInt(input[1]);
		int[] months = new int[12];
		months[0] = 0; // 1월
		months[1] = (months[0] + 31) % 7;
		months[2] = (months[1] + 28) % 7;
		months[3] = (months[2] + 31) % 7;
		months[4] = (months[3] + 30) % 7;
		months[5] = (months[4] + 31) % 7;
		months[6] = (months[5] + 30) % 7;
		months[7] = (months[6] + 31) % 7;
		months[8] = (months[7] + 31) % 7;
		months[9] = (months[8] + 30) % 7;
		months[10] = (months[9] + 31) % 7;
		months[11] = (months[10] + 30) % 7; // 12월


		int day = (months[M - 1] + D) % 7;
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		System.out.println(days[day]);
	}
}

