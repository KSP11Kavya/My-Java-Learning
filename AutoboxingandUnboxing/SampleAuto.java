package AutoboxingandUnboxing;

public class SampleAuto {
    public static void show(Integer num) {
        System.out.println("the value is" +num);

        
    }
    public static void main(String[] args) {
    System.out.println("method called ");
    show(5);
    int m = 20;
    Integer obj = m;
    System.out.println("the second value is" +obj);
    }
    
}
