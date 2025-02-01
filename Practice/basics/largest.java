package basics;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c=in.nextInt();
        int m=a;
        if(m<b){
            m=b;
        }
        if(m<c){
            m=c;
        }
        System.out.println(m);
        in.close();
    }
}
