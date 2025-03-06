import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand_gen;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
       Random rand_gen = new Random();
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("new integer :" + rand_gen.nextInt(1000));
    }
}
