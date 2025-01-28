/*
	체스판 = 8 * 8
	판자 크기 = N * M ( 8 <= N, M <= 50 )
	모든 경우의 수 확인 시 : (N - 7) * (M - 7) (N, M이 50인 경우 1849회)
	whiteLine = {"W", "B", "W", "B", "W", "B", "W", "B"}
	blackLine = {"B", "W", "B", "W" ,"B", "W" ,"B", "W"}
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1018번
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		String[][] whiteBoard = {
				{"W", "B", "W", "B", "W", "B", "W", "B"},
				{"B", "W", "B", "W", "B", "W", "B", "W"},
				{"W", "B", "W", "B", "W", "B", "W", "B"},
				{"B", "W", "B", "W", "B", "W", "B", "W"},
				{"W", "B", "W", "B", "W", "B", "W", "B"},
				{"B", "W", "B", "W", "B", "W", "B", "W"},
				{"W", "B", "W", "B", "W", "B", "W", "B"},
				{"B", "W", "B", "W", "B", "W", "B", "W"}
		};


		String[][] board = new String[N][M];

		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split("");
			board[i] = line;
		}

		// TODO: 8 * 8 형태로 board 전체를 검사해야 함

		int min = 32;
		for (int n = 0; n < N - 7; n++) {
			for (int m = 0; m < M - 7; m++) {
				int count = 0;
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (!whiteBoard[i][j].equals(board[n + i][m + j])) {
							count++;
						}
					}
				}
				if (count < min) {
					min = count;
				} else if ( 64- count < min) {
					min = 64- count;
				}
			}
		}

		System.out.println(min);
	}
}
