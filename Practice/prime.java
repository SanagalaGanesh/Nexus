import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<b;i++){
            boolean p=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    p=false;
                    break;
                }
            }
            if (p){
                System.out.println(i);
            }
        }

        sc.close();
    }
    
}
