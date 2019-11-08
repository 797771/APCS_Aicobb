import java.util.*;
/**
 * Student
 *
 * @author (Isabelle Cobb)
 * @version (10/25/19)
 */
public class Student
{
    private String fullName = "";
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private int stuNumber;
    private double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int num, double GPA)
    {
       fullName = name;
       stuNumber = num;
       gpa = GPA;
    }

    public String getName(){
        parseUserInput(fullName); 
        return (fName + " " + mName + " " + lName);
    }
    public int getNum(){
        return stuNumber;
    }
    public double getGPA(){
        return gpa;
    }
    
    public String setFName(String name){
        fName = name;
        return name;
    }
    public String setLName(String name){
        lName = name;
        return name;
    }
    public String setMName(String name){
        mName = name;
        return name;
    }
    
    public String getLastName(){
       parseUserInput(fullName);
       return lName;
    }
    public int getStudID(){
        return stuNumber;
    }
    
    /*
     * will take a String and Student Object 
     * and set the instance variables in the student 
     * object according to the user input string. 
     * (e.g. firstName, middleName, and lastName)
     */
    public void parseUserInput(String fullName){
        int comma = fullName.indexOf(",");
        int firstS = fullName.indexOf(" ");
        int lastS = fullName.lastIndexOf(" ");

        //format four
        if((comma == -1) & (lastS == firstS)){
            setFName(fullName.substring(0,firstS));
            setLName(fullName.substring(firstS+1));
        }

        //format three
        if((comma == -1) & (lastS !=firstS)){
            setFName(fullName.substring(0,firstS));
            setMName(fullName.substring((firstS+1), lastS));
            setLName(fullName.substring(lastS+1));
        }

        //format one
        if((comma != -1) & (lastS !=firstS)){
            setLName(fullName.substring(0,comma));
            setFName(fullName.substring((firstS+1), lastS));
            setMName(fullName.substring(lastS+1));
        }

        //format two
        if((comma != -1) & (lastS==firstS)){
            setLName(fullName.substring(0,comma));
            setFName(fullName.substring(firstS+1));
        }
    }
}
