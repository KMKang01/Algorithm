import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int swCount = 0;
		int esCount = 0;
		int aiCount = 0;
		int noneCount = 0;

		for (int i = 0; i < N ; i++) {
			String [] line = br.readLine().split(" ");
			int g = Integer.parseInt(line[0]);
			int c = Integer.parseInt(line[1]);
			int n = Integer.parseInt(line[2]);

			if(g == 1 ){
				noneCount++;
			} else {
				switch(c){
					case 1, 2:
						swCount++;
						break;
					case 3:
						esCount++;
						break;
					case 4:
						aiCount++;
						break;
				}
			}

		}
			System.out.printf("%d\n%d\n%d\n%d\n", swCount, esCount, aiCount, noneCount);
	}
}
