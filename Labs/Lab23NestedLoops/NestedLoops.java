
/**
 * NestedLoops
 *
 * @author (Isabelle Cobb)
 * @version (9/18)
 */
public class NestedLoops
{

    /**
     * Constructor for objects of class NestedLoops
     */
    public NestedLoops()
    {

    }

    public static void exampleA(){
        int num = 1;
        for(int r = 0; r<5;r++){
            for(int c = 0; c<=r;c++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
    
    public static void exampleB(){
        int num2 = 5;
        for(int r=4; r>0; r--){
            for(int c=12; c<=r;c--){
                System.out.print(num2);
            }
            System.out.println();
        }
    }
}
