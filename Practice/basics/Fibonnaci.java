package basics;
import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0;
        int b=1;
        int n=in.nextInt();
        System.out.print(a);
        System.out.print(b);
        for(int i=0;i<n-2;i++){
            int t=b;
            b=a+b;
            a=t;
            System.out.print(b);
        }
        in.close();
    }
}