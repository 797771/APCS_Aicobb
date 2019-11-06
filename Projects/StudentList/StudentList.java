import java.util.*;
/**
 * StudentList
 *
 * @author (Isabelle Cobb)
 * @version (10/25/19)
 */
public class StudentList
{
    private ArrayList<Student> studList = new ArrayList<Student>();

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
        int inputNum;
        double inputGPA;

        System.out.print("Student name: ");
        inputName = kb.nextLine();

        System.out.print("Student number: ");
        inputNum = kb.nextInt();

        System.out.print("Student GPA: ");
        inputGPA = kb.nextDouble();
        
        Student studListOb = new Student(inputName, inputNum, inputGPA);
        studList.add(studListOb);

    }

    /*
     * Clears the screen and then prints the list to the screen.  
     * Does not print null records
     */
    public void printList(){

        for(int i = 0; i<studList.size(); i++){
            if(studList.get(i) != null){
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            }
        }

    }

}
