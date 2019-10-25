import java.util.*;
/**
 * StudentList
 *
 * @author (Isabelle Cobb)
 * @version (10/25/19)
 */
public class StudentList
{
    private static ArrayList<Student> studList = new ArrayList<Student>();
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private int stuNumber;

    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {

    }

    /**
     * Allows the user to add a student to the end of the List.  
     * For each student, the user can imput a student number, a GPA, 
     * and a student name.  Names may be entered in one of four formats:: 	
    1. Last, First 	
    2. Last, First Middle	
    3. First Last	
    4. First Middle Last
     */
    public void addStudent(){
        Scanner kb = new Scanner(System.in);
        String inputName = "";
        
        System.out.print("Enter the Student's name");
        inputName = kb.nextLine();
        parseName(inputName);
        Student.add(inputName);
        
        
        
    }
    
    //parses out inputed student name
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
        
    }
}
