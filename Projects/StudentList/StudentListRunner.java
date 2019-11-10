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

            if(inputStr.equals("1")){//add student
                studList.addStudent();
            }
            if(inputStr.equals("2")){//delete student
                System.out.print("\nEnter \"1\" to delete a student by last name. Enter \"2\" to delete a student by student number.");
                int inputVal = kb.nextInt();

                Scanner kb2 = new Scanner(System.in);
                if(inputVal == 1){
                    System.out.print("\nStudent's Last Name: ");
                    String inputLName = kb2.nextLine();
                    studList.deleteStudentFromList(inputLName);
                }
                if(inputVal == 2){
                    System.out.print("\nStudent's student number: ");
                    int inputNum = kb2.nextInt();
                    studList.deleteStudentFromList(inputNum);
                }
            }
            if(inputStr.equals("3")){//print studentlist
                studList.printList();
            }
            if(inputStr.equals("5")){//clear studentlist
                studList.clearList();
            }
            if(inputStr.equals("6")){//sort studentlist
                System.out.print("\nEnter \"1\" to sort the student list by last name. Enter \"2\" to sort the student list by student number.");
                int inputVal = kb.nextInt();

                if(inputVal == 1){
                    studList.sortStudentsName();
                }
                if(inputVal == 2){
                    studList.sortStudentsNum();
                }
            }
            if(inputStr.equals("7")){//print one student
                System.out.print("\nEnter \"1\" to print a student by last name. Enter \"2\" to print a student by student number.");
                int inputVal = kb.nextInt();

                Scanner kb2 = new Scanner(System.in);
                if(inputVal == 1){
                    System.out.print("\nStudent's Last Name: ");
                    String inputLName = kb2.nextLine();
                    studList.printStudent(inputLName);
                }
                if(inputVal == 2){
                    System.out.print("\nStudent's student number: ");
                    int inputNum = kb2.nextInt();
                    studList.printStudent(inputNum);
                }
            }
            if(inputStr.equals("8")){//edit studentlist
                System.out.print("\nEnter \"1\" to edit the student list by last name. Enter \"2\" to edit the student list by student number.");
                int inputVal = kb.nextInt();
                
                Scanner kb2 = new Scanner(System.in);
                if(inputVal == 1){
                    System.out.print("\nStudent's Last Name: ");
                    String inputLName = kb2.nextLine();
                    studList.editStudentList(inputLName);
                }
                if(inputVal == 2){
                    System.out.print("\nStudent's student number: ");
                    int inputNum = kb2.nextInt();
                    studList.editStudentList(inputNum);
                }
            }
        }
    }

    public static void main(){
        StudentListRunner studListRun = new StudentListRunner();
    }
}
