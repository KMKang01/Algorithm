import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Agent> list = new ArrayList<>();
        for(int i = 0; i<5; i++) {
            String [] line = br.readLine().split(" ");
            list.add(new Agent(line[0], Integer.parseInt(line[1])));
        }
        list.sort(null);
        System.out.print(list.get(0).toString());
    }
}

class Agent implements Comparable<Agent>{
    String codename;
    int score;

    public Agent(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }

    @Override 
    public int compareTo(Agent a) {
        return this.score - a.score;
    }

    @Override
    public String toString(){
        return codename + " " + score;
    }
}