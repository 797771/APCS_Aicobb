
/**
 * Question5
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question5
{
    private int number;
    private int sum = 0;

    /**
     * Constructor for objects of class Question5
     */
    public Question5(int num)
    {
        number = num;
    }

    public int sumDigits(){
        System.out.print("Question 5) ");
        
        if((number>-10) & (number<10)){
            sum = number;
        }
        else{
            while(number!=0){
                sum+=number%10;
                number= number/10;
            }
        }
        
        System.out.println(sum);
        return(sum);
    }
}
