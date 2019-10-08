
/**
 * Question11
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question11
{
    int[] nums = {7,8,3,5};
    int sum = 0;
    
    /**
     * Constructor for objects of class Question11
     */
    public Question11()
    {

    }

    public void arraySum(){
        System.out.print("Question 11) ");
        
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
    
}
