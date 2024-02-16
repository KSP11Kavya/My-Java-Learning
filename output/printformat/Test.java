package output.printformat;

public class Test {
    public static void main(String[] args) {
        int x = 100,y=200;
        System.out.format("Value of is %d ln ",x);
        float yValue = (float) Math.PI;
        System.out.println(y);
        System.out.format("Value of PI= %2f/n",yValue);
        System.out.format("Value of PI= %52f/n",yValue);
        System.out.format("Value of PI= %05.2f/n",yValue);
        System.out.format("x = %d,y=%d",x,yValue);

        
    }
    
}
