
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
        int firstS = fullName.indexOf(" ");
        int lastS = fullName.lastIndexOf(" ");
        
        //format four
        if((comma == -1) & (lastS == firstS)){
            fName = fullName.substring(0,firstS);
            lName = fullName.substring(firstS+1);
        }
        
        //format three
        if((comma == -1) & (lastS !=firstS)){
            fName = fullName.substring(0,firstS);
            mName = fullName.substring((firstS+1), lastS);
            lName = fullName.substring(lastS+1);
        }
        
        //format one
        if((comma != -1) & (lastS !=firstS)){
            lName = fullName.substring(0,comma);
            fName = fullName.substring((firstS+1), lastS);
            mName = fullName.substring(lastS+1);
        }
        
        //format two
        if((comma != -1) & (lastS==firstS)){
            lName = fullName.substring(0,comma);
            fName = fullName.substring(firstS+1);
        }
        
        System.out.println();
        System.out.println("First Name: " + fName);
        System.out.println("Middle Name: " + mName);
        System.out.println("Last Name: " + lName);
    }
}
