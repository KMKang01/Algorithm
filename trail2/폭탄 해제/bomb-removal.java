import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        Bomb bomb = new Bomb(input[0], input[1], Integer.parseInt(input[2]));
        System.out.print(bomb.toString());
    }
}

class Bomb {
    String code;
    String color;
    int second;
    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
    @Override
    public String toString(){
        return "code : " + code + "\ncolor : " + color + "\nsecond : " + second;
    }
}