
/**
 * Question6
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question6
{
    private int num1;
    private int num2;
    
    /**
     * Constructor for objects of class Question6
     */
    public Question6(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public int add(){
       System.out.println("Question 6) " + (num1+num2));
       return(num1+num2);
    }
    
    public int multiply(){
       System.out.println(num1*num2);
       return(num1*num2);
    }
    
    public int divide(){
       System.out.println(num1/num2);
       return(num1/num2);
    }
    
    public int subtract(){
       System.out.println(num1-num2);
       return(num1-num2);
    }
}
