package basics;
import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int count=0;
        while(n>0){
            int r=n%10;
            if(r==a){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }

}

