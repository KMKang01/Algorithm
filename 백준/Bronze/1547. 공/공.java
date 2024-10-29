import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
	<요구사항 정리>

	1. 3개의 컵 (왼쪽부터 1, 2, 3번)이 있고, 1번 컵 아래에 공을 하나 넣음.
	2. 두 개의 컵을 고르고 위치를 맞바꾼다.
	(1번과 2번을 택한 경우 2 1 3 의 순서로 컵이 놓이며, 공의 위치는 바뀌지 않기 때문에 공이 있는 컵은 2번 컵이다.)
	3. 최종적으로 공이 들어있는 컵의 번호를 구한다.

* */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());

		ArrayList<Integer> cups = new ArrayList<>();
		cups.add(1);
		cups.add(2);
		cups.add(3);

		for (int i = 0; i < M; i++) {
			String[] line = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);

			swap(x, y, cups);
		}

		System.out.println(cups.get(0));
	}

	static void swap(int x, int y, ArrayList<Integer> cups){
		int idx1 = cups.indexOf(x);
		int idx2 = cups.indexOf(y);

		cups.set(idx1, y);
		cups.set(idx2, x);
	}
}
