import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0 ; i<n; i++){ 
            int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(new Student(arr[0], arr[1], i+1));
        }
        list.sort(
            Comparator
              .comparingInt(Student::getHeight).reversed()
              .thenComparingInt(Student::getWeight).reversed()
        );

        for(Student s: list) System.out.println(s.toString());
    }
}

class Student {
    int height;
    int weight;
    int num;

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public int getNum(){
        return num;
    }

    Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public String toString(){
        return String.format("%d %d %d", height, weight, num);
    }
}