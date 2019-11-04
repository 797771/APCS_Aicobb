import java.util.*;
/**
 * StudentListRunner
 *
 * @author (Isabelle Cobb)
 * @version (10/25/19)
 */
public class StudentListRunner
{
    /**
     * Constructor for objects of class StudentListRunner
     */
    public StudentListRunner()
    {
        menuNumber();
    }

    public void menuNumber(){
        StudentList studList = new StudentList();
        Scanner kb = new Scanner(System.in);
        String inputStr= "";
        while(!inputStr.equals("quit")){
            System.out.println("\nChoose one of the following options by entering the corresponding number. Press \"quit\" and any time to exit.");
            System.out.println("1. Add a student\n2. Delete a student\n3. Print StudentList");
            System.out.println("4. Search for a Student\n5. Clear Student List\n6. Sort Student List");
            System.out.println("7. Print one Student\n8. Edit Student List");
            inputStr = kb.nextLine();
            
            if(inputStr.equals("1")){
                studList.addStudent();
            }
            if(inputStr.equals("3")){
                studList.printList();
            }
        }
    }
    
    public static void main(){
        StudentListRunner studListRun = new StudentListRunner();
    }
}
