
/**
 * DigitArrayClass
 *
 * @author (Isabelle Cobb)
 * @version (9/12)
 */
public class DigitArrayClass
{
    private int num = 9876;
    int[] digits =new int[4];

    /**
     * Constructor for objects of class DigitArrayClass
     */
    public DigitArrayClass()
    {

    }

    //loads array digits with numbers from int num
    public void loadArray(){
        for(int i=0;i<digits.length; i++){
            digits[i] = (num%10);
            num = (int)(num/10);
        }
    }

    //returns array digits
    public void getDigits(){
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i] + ", ");
        }
    }
}
