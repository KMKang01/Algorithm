import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] line = br.readLine().split(" ");
		int yt = Integer.parseInt(line[0]);
		int yj = Integer.parseInt(line[1]);
		boolean ytTurn = true;
		while(yt < 5 && yj < 5) {
			if(ytTurn){
				yj += yt;
				ytTurn = false;
			} else {
				yt += yj;
				ytTurn = true;
			}
		}
		if(yt >= 5) System.out.println("yj");
		else System.out.println("yt");
	}
}