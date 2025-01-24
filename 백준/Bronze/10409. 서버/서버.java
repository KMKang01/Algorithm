import java.io.*;


public class Main{
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] fLine = br.readLine().split(" ");
		int N = Integer.parseInt(fLine[0]);
		int T = Integer.parseInt(fLine[1]);

		int sum = 0;
		int count = 0;
		String [] sLine = br.readLine().split(" ");
		for(int i = 0; i < N ; i++){
			if(sum + Integer.parseInt(sLine[i]) <= T) {
				sum += Integer.parseInt(sLine[i]);
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}