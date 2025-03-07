import java.util.Random;
import java.util.ArrayList;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder{
    //22
    private ArrayList<String>responses;
    private Random rand_gen; 
    

     /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
      rand_gen = new Random();
      responses = new ArrayList<>();  
      filleResponses();
    }
    private void filleResponses(){
       responses.add("have you tried turning it off and on ?");
       responses.add("Check the manual.");
       responses.add("I don't know, ask again.");
    }
    public String generateResponse(){
        return responses. get (rand_gen.nextInt(responses.size()));
    }

    
}
