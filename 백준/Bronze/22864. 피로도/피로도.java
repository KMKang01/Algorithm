import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		int M = Integer.parseInt(line[3]);

		int progress = 0;
		int stress = 0;
		int hour = 0;

		while (hour < 24) {
			if (stress + A <= M) {
				progress += B;
				stress += A;
				hour++;
			} else {
				stress -= C;
				if (stress < 0) stress = 0;
				hour++;
			}
		}

		System.out.println(progress);
	}
}