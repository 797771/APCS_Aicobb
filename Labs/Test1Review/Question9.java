
/**
 * Question9
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question9
{
    int[] nums = new int[10];
    
    /**
     * Constructor for objects of class Question9
     */
    public Question9()
    {

    }

    public void loadArray(){
        System.out.print("Question 9) ");
        for(int i=0; i<nums.length;i++){
            nums[i] = (int)(Math.random()*10) + 1;
        }
    }
}
