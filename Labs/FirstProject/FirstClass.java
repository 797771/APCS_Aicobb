
/**
 * FirstClass.
 *
 * @author (Isabelle Cobb)
 * @version (8/15)
 */
public class FirstClass
{
    private static int x;
    
    /**
     * Constructor for objects of class FirstClass
     */
    public FirstClass()
    {

    }

    //this prints a string
    public static void printName(String name, int n){
        System.out.print("Hello, " + name + "  " + n);
    }
    //this is my main method
    public static void main(){
       //this initializes variables
        x = 13;
        printName("Sarah", x);
    }
}