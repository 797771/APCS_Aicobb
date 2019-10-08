/**
 * Question1
 *
 * @author (Isabelle Cobb)
 * @version (9/12)
 */
public class Question1
{
    private boolean test = true;  //example 1
    
    //all code below is example 2, code that has been commented does not compile b/c it is incorrect
    //boolean test == true;
    //int x = 7.23;
    //int val = 7/12.0;
    
    private double num2 = 5.1;
    private double num1 = num2%3;

    /**
     * Constructor for objects of class Question1
     */
    public Question1()
    {

    }

    public double runNum(){
        System.out.println("Question 1) "+ num1);
        return num1;
    }
}
