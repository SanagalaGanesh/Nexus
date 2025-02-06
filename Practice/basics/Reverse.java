package basics;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int a=in.nextInt();
       int s=0;
       while(a>0){
        int r=a%10;
        s=s*10+r;
        a=a/10;
       } 
       System.out.println("Reverse Number :" +s);
         in.close();
    }
}
