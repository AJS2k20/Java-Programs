
import java.util.Random;


public class RandomExample {
    public static void main(String args[])
    {
        Random rand = new Random();
        
        int r = rand.nextInt(1000);
        int q = rand.nextInt(1000);
        
        System.out.println("Random number 1: "+r);
        System.out.println("Random number 2: "+q);
        
        double d1 = rand.nextDouble();
        double d2 = rand.nextDouble();
        
        System.out.println("Random double number 1: "+d1);
        System.out.println("Random double number 2: "+d2);
    }
}
