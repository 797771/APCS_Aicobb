import java.util.*;
/**
 * Test
 *
 * @author (Isabelle Cobb)
 * @version (9/16)
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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i = 0; i<5; i++){
            nums.add((int)(Math.random()*10));
        }

        System.out.print("Original array: ");
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i) + ", ");
        }
        
        nums.remove(0);
        
        System.out.println("Remove array: ");
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i) + ", ");
        }
    }
}
