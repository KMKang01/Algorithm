import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			int zeroCount = 0;
			int oneCount = 0;
			if(num == 0) {
				sb.append("1 0\n");
			} else if (num == 1) {
				sb.append("0 1\n");
			} else {
				/*
					f(3) = f(2) + f(1)
					f(3) = f(1) + f(0) + f(1) --> 1 2

					f(4) = f(3) + f(2)
					f(4) = f(2) + f(1) + f(1) + f(0)
					f(4) = f(1) + f(0) + f(1) + f(1) + f(0) --> 2 3

					f(5) = f(4) + f(3)
					f(5) = f(3) + f(2) + f(2) + f(1)
					f(5) = f(2) + f(1) + f(1) + f(0) + f(1) + f(0) + f(1)
					f(5) = f(1) + f(0) + f(1) + f(1) + f(0) + f(1) + f(0) + f(1) --> 3 5

					f(6) = f(5) + f(4) --> 5 8
				*/
				for (int j = 0; j < num ; j++) {
					if(j == 0) {
						zeroCount = 1; // f(0) = 1
					} else if (j == 1) {
						oneCount = 1; // f(1) = 1
					} else {
						int tempZero = zeroCount;
						int tempOne = oneCount;
						zeroCount = tempOne; // f(n) = f(n-1)
						oneCount = tempZero + tempOne; // f(n) = f(n-2) + f(n-1)
					}
				}
				sb.append(zeroCount + " " + oneCount + "\n");
			}
		}

		System.out.println(sb.toString().trim());
	}
}