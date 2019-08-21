
/**
 * FirstMethods
 *
 * @author (Isabelle Cobb)
 * @version (8/19)
 */
public class FirstMethods
{
    /**
     * Constructor for objects of class FirstMethods
     */
    public FirstMethods()
    {

    }

    //adds two integers
    public static int add(int a, int b){
        return(a + b);
    }

    //subtracts two integers
    public static int subtract(int a, int b){
        return (a - b);
    }

    //multiplies two integers
    public static int multiply(int a, int b){
        return (a * b);
    }

    //divides two integers
    public static int divide(int a, int b){
        if (b == 0){
            return (-1);
        }
        return (a / b);
    }

    //this produces the greater value
    public static int greaterThan(int a, int b){
        if (a > b){
            return(a);
        }
        if (a < b){
            return(b);
        }
        return(a);
    }

    //this is my main method, it prints the solutions
    public static void main(){
        System.out.println(add(5, 7));
        System.out.println(subtract(10, 3));
        System.out.println(multiply(3, 2));
        System.out.println(divide(8, 4));
        System.out.println(greaterThan(5, 3));
    }
}