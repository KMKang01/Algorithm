import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(new Student(arr[0], arr[1], i + 1));
        }
        list.sort(Comparator
            .comparingInt(Student::getH)
            .thenComparingInt(Student::getW).reversed()
            .thenComparingInt(Student::getNum)
        );
        for(Student s: list) System.out.println(s.toString());
    }
}
class Student {
    int num;
    int h;
    int w;

    public int getNum() {return num;}
    public int getH() {return h;}
    public int getW() {return w;}
    
    Student(int h, int w, int num){
        this.h = h;
        this.w = w;
        this.num = num;
    }

    public String toString() {
        return String.format("%d %d %d", h, w, num);
    }
}