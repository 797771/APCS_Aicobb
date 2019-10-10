import java.util.Scanner;
/**
 * Test
 *
 * @author (Isabelle Cobb)
 * @version (10/8/19)
 */
public class Test
{
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {

    }

    public static void main(){
        int[] evens = new int[4];
        
        int index = 0;
        while(index<4){
            int random = (int)(Math.random()*7)+2;
            while(random % 2 != 0){
                random = (int)(Math.random()*7)+2;
            }
            if(random % 2 ==0){
                evens[index] = random;
            }
            System.out.print(evens[index] + ", ");
            index++;
        }
        
        
    }

}
