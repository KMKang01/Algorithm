import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		for(int a=1; a<=9; a++){
			// A가 a인지 물어보고 flush를 한다.
			// System.out.println은 자동으로 flush도 해준다.
			System.out.println("? A " + a);

			// 채점기의 답변을 입력받는다.
			int resp = sc.nextInt();

			if(resp == 1){
				// 답변이 "예"이므로 A의 값은 a이다.
				// B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
				int b = 1;
				for ( ; b <= 9 ; b++) {
					System.out.println("? B " + b);
					resp = sc.nextInt();
					if(resp == 1) {
						break;
					}
				}

				System.out.println("! " + (a + b));
				break;
			}
		}


	}
}