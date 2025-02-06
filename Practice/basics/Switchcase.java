package basics;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the day number");
        int d=in.nextInt();
        switch(d){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day number");
        }
        in.close();
    }
    
}
