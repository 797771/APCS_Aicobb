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
     * For each student, the user can input a student number, a GPA, 
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
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            }
        }

        if(studList.size() <=0){
            System.out.print("\nThere are no students currently in the Student list.");
        }
    }

    /*
     * Allows the user to specify a Student last name deleted from the list.  
     */
    public void deleteStudentFromList(String lName){

        for(int i = 0; i<studList.size();i++){
            if(lName.equals(studList.get(i).getLastName())){
                studList.remove(i);
            }
        }

    }

    /*
     *   Allows the user to specify a student number and deletes that student from the list.
     */
    public void deleteStudentFromList(int stuNumber){
        for(int i = 0; i<studList.size();i++){
            if(stuNumber == studList.get(i).getNum()){
                studList.remove(i);
            }
        }
    }

    /*
     * Deletes the entire list (null in each element without a student record)
     */
    public void clearList(){
        studList.clear();
        if(studList.size() <=0){
            System.out.print("\nThere are no students currently in the Student list.");
        }
    }

    /*
     * Clears  the screen and then prints a student with the input name to the screen.  
     * If the Student does not exist, print message to the console: "Student does not exist."
     */
    public void printStudent(String lastName){
        int existVal = 0;
        for(int i = 0; i<studList.size();i++){
            if(lastName.equals(studList.get(i).getLastName())){
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            }
            if(!lastName.equals(studList.get(i).getLastName())){
                existVal++;
            }
        }

        if(existVal == studList.size()){
            System.out.println("\nStudent does not exist.");
        }
    }

    /*
     * Clears  the screen and then prints a student student with the input student number to the screen.  
     * If the Student does not exist, print message to the console: "Student does not exist."
     */
    public void printStudent(int stuNumber){
        int existVal = 0;
        for(int i = 0; i<studList.size();i++){
            if(stuNumber == studList.get(i).getNum()){
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            }
            if(stuNumber != studList.get(i).getNum()){
                existVal++;
            }
        }

        if(existVal == studList.size()){
            System.out.println("\nStudent does not exist.");
        }
    }

    /*
     * Sorts students by student name
     */
    public void sortStudentsName(){
        for(int i = 1; i<studList.size(); i++){//insertion sort
            int j = i;
            while(j>0 && (studList.get(j).getLastName().compareTo(studList.get(j-1).getLastName()))<0)
            {
                swapList(studList, j, j-1);
                j--;
            }
        }

    }

    /*
     * Sorts students by student number,
     * want to put object with smallest student number at 
     * front of list
     */
    public void sortStudentsNum(){
        for(int i = 1; i<studList.size(); i++){//insertion sort
            int j = i;
            while(j>0 && (studList.get(j).getNum() < 
                studList.get(j-1).getNum())){
                swapList(studList, j, j-1);
                j--;
            }
        }
    }

    //swapping method for different sorting methods
    public void swapList(ArrayList<Student> tempList, int i, int n){
        Student temp = tempList.get(i);
        tempList.set(i, tempList.get(n));
        tempList.set(n, temp);
    }

    /*
     * Allows the user to specify a student name and then update or change the Student name and GPA
     */
    public void editStudentList(String lastName){
        for(int i = 0; i<studList.size();i++){
            if(lastName.equals(studList.get(i).getLastName())){
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());

                Scanner kb2 = new Scanner(System.in);
                String newName = "";
                double newGPA;

                System.out.print("Student name: ");
                newName = kb2.nextLine();

                System.out.print("Student GPA: ");
                newGPA = kb2.nextDouble();

                Student studListTemp = new Student(newName, studList.get(i).getNum(), newGPA);
                studList.set(i, studListTemp);
            }
        }
    }

    /*
     * Allows the user to specify a Student number and then update or change the Student name and GPA
     */
    public void editStudentList(int stuNumber){
        for(int i = 0; i<studList.size();i++){
            if(stuNumber == studList.get(i).getNum()){
                System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());

                Scanner kb2 = new Scanner(System.in);
                String newName = "";
                double newGPA;

                System.out.print("Student name: ");
                newName = kb2.nextLine();

                System.out.print("Student GPA: ");
                newGPA = kb2.nextDouble();

                Student studListTemp = new Student(newName, studList.get(i).getNum(), newGPA);
                studList.set(i, studListTemp);
            }
        }
    }

}
