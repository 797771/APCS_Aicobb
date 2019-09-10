
/**
 * Student Class
 *
 * @author (Isabelle Cobb)
 * @version (8/21)
 */
public class Student
{
    // instance variables
    private String stuName;
    private int stuNumber;

    //Constructor
    public Student(String name, int num)
    {
        stuName = name;
        stuNumber = num;
    }

    //Methods

    public String getName(){
        return stuName;
    }

    public int getNumber(){
        return stuNumber;
    }
}