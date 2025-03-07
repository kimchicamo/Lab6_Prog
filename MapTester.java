import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    //27
    private HashMap<String, String> phoneBook;
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        phoneBook =  new HashMap<>();
    }
    public void enterNumber(String name,String number){
       phoneBook. put(name, number);
    }
    public String lookupNumber(String name){
    return phoneBook.get(name);
    }

    
}
