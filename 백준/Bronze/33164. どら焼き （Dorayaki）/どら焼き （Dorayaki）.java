import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 33164번
		String [] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);

		String [] line1 = br.readLine().split(" ");
		String [] line2 = br.readLine().split(" ");
		int [] arr1 = new int[N];
		int [] arr2 = new int[M];
		for(int i=0; i<N; i++) {
			arr1[i] = Integer.parseInt(line1[i]);
		}
		for (int i=0; i<M; i++) {
			arr2[i] = Integer.parseInt(line2[i]);
		}

		long sum = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sum += (long) (arr1[i] + arr2[j]) * Math.max(arr1[i],arr2[j]);
			}
		}
		System.out.println(sum);
	}
}