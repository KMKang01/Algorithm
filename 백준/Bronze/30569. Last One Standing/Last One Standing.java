import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] p1 = br.readLine().split(" ");
		String [] p2 = br.readLine().split(" ");

		int p1Health = Integer.parseInt(p1[0]);
		int p1Damage = Integer.parseInt(p1[1]);
		int p1Reload = Integer.parseInt(p1[2]);

		int p2Health = Integer.parseInt(p2[0]);
		int p2Damage = Integer.parseInt(p2[1]);
		int p2Reload = Integer.parseInt(p2[2]);

		int t = 0;
		while(p1Health > 0 && p2Health > 0) {
			if(t==0) { // 맨 처음에는 무조건 서로 공격
				p1Health -= p2Damage;
				p2Health -= p1Damage;
			}
			t++;
			if(t % p1Reload == 0) {
				p2Health -= p1Damage;
			}
			if(t % p2Reload == 0) {
				p1Health -= p2Damage;
			}
			if(p1Health <= 0 && p2Health <= 0) {
				System.out.println("draw");
				break;
			} else if(p2Health <= 0 && p1Health > 0) {
				System.out.println("player one");
				break;
			} else if(p1Health <= 0 && p2Health > 0) {
				System.out.println("player two");
				break;
			}
		}
	}
}