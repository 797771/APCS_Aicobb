
/**
 * SimpleCalc
 *
 * @author (Isabelle Cobb)
 * @version (9/12)
 */
public class SimpleCalc
{
    private int a1;
    private int b1;

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(int a, int b)
    {
        a1 = a;
        b1 = b;
    }

    //adds ints and returns a double
    public double add(){
        System.out.println(a1+b1);
        return(a1+b1);
    }

    //subtracts two int values and returns a double
    public double subtract(){
        System.out.println(a1-b1);
        return(a1-b1);
    }

    //mutiplies two ints and retruns a double
    public double multiply(){
        System.out.println(a1*b1);
        return(a1*b1);
    }

    //divides two ints and returns a double
    public double divide(){
        if(b1==0){
            b1 = 1;
            System.out.println(a1/b1);
        } 
        else{
            System.out.println(a1/b1);
        }
        return(a1/b1);
    }

    //uses modeular division with two ints and returns int
    public int moduloDivide(){
        System.out.println(a1%b1);
        return(a1%b1);
    }
}
