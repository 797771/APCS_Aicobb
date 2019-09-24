
/**
 * Person
 *
 * @author (Isabelle Cobb)
 * @version (9/24)
 */
public class Person
{
    String fName = "";
    String mName = "";
    String lName = "";

    /**
     * Constructor for objects of class Person
     */
    public Person(String fullName)
    {
        parseName(fullName);
    }

    public void parseName(String fullName){
        int comma = fullName.indexOf(",");
        //format four
        if((comma == -1) & (fullName.lastIndexOf(" ")==fullName.indexOf(" "))){ //
            fName = fullName.substring(0,fullName.indexOf(" "));
            lName = fullName.substring(fullName.indexOf(" ")+1);
        }
        
        //format three
        if((comma == -1) & (fullName.lastIndexOf(" ")!=fullName.indexOf(" "))){
            fName = fullName.substring(0,fullName.indexOf(" "));
            mName = fullName.substring((fullName.indexOf(" ")+1), fullName.lastIndexOf(" "));
            lName = fullName.substring(fullName.lastIndexOf(" ")+1);
        }
        
        //format one
        if((comma != -1) & (fullName.lastIndexOf(" ")!=fullName.indexOf(" "))){
            lName = fullName.substring(0,fullName.indexOf(","));
            fName = fullName.substring((fullName.indexOf(" ")+1), fullName.lastIndexOf(" "));
            mName = fullName.substring(fullName.lastIndexOf(" ")+1);
        }
        
        //format two
        if((comma != -1) & (fullName.lastIndexOf(" ")==fullName.indexOf(" "))){
            lName = fullName.substring(0,fullName.indexOf(","));
            fName = fullName.substring(fullName.indexOf(" ")+1);
        }
        
        System.out.println();
        System.out.println("First Name: " + fName);
        System.out.println("Middle Name: " + mName);
        System.out.println("Last Name: " + lName);
    }
}
