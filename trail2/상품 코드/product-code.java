import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");
        Product p1 = new Product("codetree", "50");
        Product p2 = new Product(line[0], line[1]);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

class Product {
    String name;
    String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString(){
        return "product " + code + " is " + name;
    }
}