package BuffereReader;
import java.io.*;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Your Entered " + x);
    }
    
}
