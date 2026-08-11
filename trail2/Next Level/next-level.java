import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        User user1 = new User("codetree", 10);
        User user2 = new User(input[0], Integer.parseInt(input[1]));
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}

class User {
    String id;
    int lv;
    User (String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
    @Override
    public String toString() {
        return "user " + id + " lv " + lv;
    }
}