import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String answer = "";

        for (int i = 0; i < N; i++) {
            String tmp = sc.next();
            switch (tmp) {
                case "Algorithm":
                    answer = answer + "204\n";
                    break;
                case "DataAnalysis":
                    answer = answer + "207\n";
                    break;
                case "ArtificialIntelligence":
                    answer = answer + "302\n";
                    break;
                case "CyberSecurity":
                    answer = answer + "B101\n";
                    break;
                case "Network":
                    answer = answer + "303\n";
                    break;
                case "Startup":
                    answer = answer + "501\n";
                    break;
                case "TestStrategy":
                    answer = answer + "105\n";
                    break;
            }
        }
        System.out.println(answer.trim());
    }
}