package Scanner;

import java.util.Scanner;
class Q4{
    
    // Function to take input using Scanner class
    public static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int a= sc.nextInt();
            float b= sc.nextFloat();
            long c= sc.nextLong();
            byte d= sc.nextByte();
            sc.nextLine();
            String s=sc.nextLine();
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
            
        }
        
    }
    public static void main(String[] args){
        IOFunction();
    }
    
}
