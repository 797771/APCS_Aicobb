
/**
 * Question12
 *
 * @author (Isabelle Cobb)
 * @version (9/13)
 */
public class Question12
{

    /**
     * Constructor for objects of class Question12
     */
    public Question12()
    {

    }

    public int[] copyArray(int[] origArray){
        System.out.println("Question 12) ");
        int[] newArray = new int[origArray.length];

        for(int i=0; i<origArray.length; i++){
            newArray[i] = origArray[i];
        }
        
        return( newArray );
    }
    
    public void printArray(int[] newArray){
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i] + ", ");
        }
    }
}
