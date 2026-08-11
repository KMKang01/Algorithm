import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        String [] line = sc.nextLine().split(" ");
        sCode = line[0];
        mPoint = line[1].charAt(0);
        time = Integer.parseInt(line[2]);
        Secret secret = new Secret(sCode, mPoint, time);
        System.out.print(secret.toString());
    }
}

class Secret {
    String sCode;
    char mPoint;
    int time;
    public Secret(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
    @Override
    public String toString(){
        return "secret code : " + sCode + "\nmeeting point : " + mPoint + "\ntime : " + time;
    }
}