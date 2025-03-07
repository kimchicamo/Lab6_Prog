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
    
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {   phoneBook =  new HashMap<>();
    }
    public void fillphoneBook(){
        phoneBook.put("kimia","1111");
        phoneBook.put("fatima","2222");
        phoneBook.put("ilsa", "3333");
    }
    public void enterNumber(String name,String number){
        phoneBook.put(name, number);
    }
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
    //30
    //if (map.containKey"key")){...}
    //32 we use the keyset() method
    
}


 

