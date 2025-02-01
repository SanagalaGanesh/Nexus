package basics;
import java.util.Scanner;
public class claci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("Enter the operator");
            char ch=in.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
                System.out.println("Enter two Numbers");
                int a=in.nextInt();
                int b=in.nextInt();
                if(ch=='+'){
                    ans=a+b;
                }
                if(ch=='-'){
                    ans=a-b;
                }
                if(ch=='*'){
                    ans=a*b;
                }
                if(ch=='%'){
                    ans=a%b;
                }
                if(ch=='/'){
                    if(b!=0){
                        ans=a/b;
                    }
                }
            }
            else if(ch=='x'||ch=='X'){
                break;
            } 
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
    }
    in.close();
  }
}
