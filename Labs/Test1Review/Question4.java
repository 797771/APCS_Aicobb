
/**
 * Question4
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question4
{
    private int num1;
    private int num2;
    private int sum = 0;
    private int length = 0;
    
    /**
     * Constructor for objects of class Question4
     */
    public Question4()
    {
        
    }

    public int getLength(int x){
        num1 = x;
        
        while(x!=0){
            length++;
            x=x/10;
        }

        System.out.println("Question 4) " + length);
        return length;
    }

    
    public int getSum(int y){
        num2 = y;
        
        while(y!=0){
            sum+=(y%10);
            y=y/10;
        }
        System.out.println(sum);
        return(sum);
    }
    
}