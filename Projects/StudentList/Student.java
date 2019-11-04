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
        return fullName;
    }
    public int getNum(){
        return stuNumber;
    }
    public double getGPA(){
        return gpa;
    }
}
