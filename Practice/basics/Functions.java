package basics;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //System.out.println(oddeven());
        System.out.println(Vote());
        
    }
    // static String oddeven(){
    //     Scanner in=new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int a=in.nextInt();
    //     if (a%2==0){
    //         return "Even";}

    //     else{
    //         return"odd";
    //     }
    }
    static String Vote() {
        System.out.print("Enter Your age :");
        int age=in.nextInt();
        if (age > 18) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
}


