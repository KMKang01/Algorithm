import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 운동 -> T만큼 증가.
 * 처음이 X인 경우 1분 뒤 맥박은 X+T
 * M이 넘지 않도록하고, m보다 작지 않도록 한다.
 * 휴식 -> R만큼 감소
 * 처음이 X인 경우 1분 뒤 맥박은 X-R
 * 하한: m <= X - R	상한: X + T <= M
 *
 * */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lines = br.readLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		int m = Integer.parseInt(lines[1]);
		int M = Integer.parseInt(lines[2]);
		int T = Integer.parseInt(lines[3]);
		int R = Integer.parseInt(lines[4]);
		int X = m;
		int minute = 0;
		boolean canDo = true;
		while (N > 0) {
			if (X + T <= M) {
				X += T;
				minute++;
				N--;
			} else {
				if (m <= X - R) {
					X -= R;
					minute++;
				} else {
					X = m;
					minute++;
					if(X+T>M){
						canDo = false;
						break;
					}
				}
			}
		}
		if (canDo) {
			System.out.println(minute);
		} else {
			System.out.println(-1);
		}
	}
}
