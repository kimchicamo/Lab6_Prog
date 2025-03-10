import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder{
    //22+33
    private ArrayList<String>responses;
    private Random rand_gen; 
    private HashMap<String, String> responsesMap;

     /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
      rand_gen = new Random();
      responses = new ArrayList<>();  
      responsesMap = new HashMap<>();
      filleResponsesMap(); 
      filleResponses();
    }
        

    //43
    private void filleResponsesMap(){
      responsesMap.put("slow", "give it more  time");
      responsesMap.put("crash", "restart");
      responsesMap.put("frozen", "no way other than reboot");
      responsesMap.put("password", "Try resetting your password.");
      responsesMap.put("internet", "Check your router connection.");
    }
    private void filleResponses(){
       responses.add("have you tried turning it off and on ?");
       responses.add("Check the manual.");
       responses.add("I don't know, ask again.");
    }
    
    public String generateResponse(HashSet<String> words) {
        for (String word : words) {
            if (responsesMap.containsKey(word)) {
                return responsesMap.get(word);
            }
        }
        return pickDefaultResponse();
    }
    private String lastResponse = "";
    private String pickDefaultResponse() {
        String newResponse;
        do {
        newResponse = responses.get(rand_gen.nextInt(responses.size()));
        } while (newResponse.equals(lastResponse));

        lastResponse = newResponse;
        return newResponse;
    }
}



    
    


