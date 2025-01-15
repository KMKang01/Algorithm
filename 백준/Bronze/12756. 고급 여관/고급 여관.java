import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line1 = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");

		int x1 = Integer.parseInt(line1[0]);
		int y1 = Integer.parseInt(line1[1]);
		int x2 = Integer.parseInt(line2[0]);
		int y2 = Integer.parseInt(line2[1]);

		String str ="";

		while(y1 > 0 && y2 > 0 ) {
			y1 -=x2;
			y2 -=x1;
		}
		if( y1 <= 0 && y2 <= 0 ) {
			str = "DRAW";
		} else if ( y1 > 0 && y2 <=0){
			str = "PLAYER A";
		} else if (y1 <=0 && y2 > 0){
			str = "PLAYER B";
		}

		System.out.println(str);
	}
}