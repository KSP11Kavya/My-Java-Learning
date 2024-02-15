package Scanner;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        a = sc.nextInt();
        System.out.println("Enter your Second Number");
        b = sc.nextInt();
        c = a+b;
        System.out.println("Addition=" +c);
    }
    
}
