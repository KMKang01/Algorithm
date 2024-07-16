import javax.sql.rowset.serial.SerialStruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int x1, y1, r1, x2, y2, r2;

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            int dx = x2 - x1;
            int dy = y2 - y1;
            int dd = dx * dx + dy * dy;
            int rSum = r1 + r2;
            int rDiff = Math.abs(r1 - r2);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append("-1\n");
            } else if (dd == rSum * rSum || dd == rDiff * rDiff) {
                sb.append("1\n");
            } else if (dd < rSum * rSum && dd > rDiff * rDiff) {
                sb.append("2\n");
            } else {
                sb.append("0\n");
            }

        }
        System.out.println(sb.toString().trim());
    }
}
