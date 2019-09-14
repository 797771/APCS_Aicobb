
/**
 * Numbers
 *
 * this class is for question 3
 * 
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Numbers
{
    private int a;
    private int b;
   
    /**
     * Constructor for objects of class Numbers
     */
    public Numbers(int x, int y)
    {
        a=x;
        b=y;
    }

    public int multiply(){
        System.out.println("Question 3) "+ (a*b));
        return(a*b);
    }
}
