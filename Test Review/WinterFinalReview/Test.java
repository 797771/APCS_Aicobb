import java.util.*;
/**
 * Test
 *
 * @author (Isabelle Cobb)
 * @version (12/11/19)
 */
public class Test
{

    /**
     * Constructor for objects of class Test
     */
    public Test(){
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i< 10;i++){
            n.add((int)(Math.random()*10)+1);
        }

        //adjustMaxMin(nums, 5);
        String[] randStrings = {"yes", "no", "maybe", "perhaps", "It remains to be seen"};
        String response = getRandomResponse(randStrings);
        System.out.println("Response: " + response);
        
        int[][] nums = new int[10][10];
        int numEvens = loadNums(nums);
        System.out.println("Number of even values: " + numEvens);
    }

    
    public String getRandomResponse(String[] str){
        int randVal = (int)(Math.random()*str.length);

        return str[randVal];    
    }

    

    public int loadNums(int[][] twoArr){
        int evenVal = 0;
        for(int r = 0; r < twoArr.length; r++){
            for(int c = 0; c < twoArr[r].length;c++){
                twoArr[r][c] = (int)(Math.random()*10)+1;
                if(twoArr[r][c] %2 == 0){
                    evenVal++;
                }
            }
        }
        return evenVal;
    }

    public static void main(){
        Test run = new Test();
    }
}
