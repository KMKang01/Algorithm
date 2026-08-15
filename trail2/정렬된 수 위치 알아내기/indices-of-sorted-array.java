import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Element> list = new ArrayList<>();
        int n =  Integer.parseInt(br.readLine());
        int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<n; i++) {
            list.add(new Element(i+1, arr[i]));
        }
        ArrayList<Element> copyList = new ArrayList<>(list);
        copyList.sort(Comparator.comparingInt(Element::getValue));
        
        // 원본 리스트와 num 비교
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(list.get(i).getNum() == copyList.get(j).getNum()) System.out.print((j+1) + " " );
            }
        }
    }
}

class Element {
    int num;
    int value;

    public int getNum() {return num;}
    public int getValue() {return value;}

    Element(int num, int value) {
        this.num = num;
        this.value = value;
    }

    
    
}