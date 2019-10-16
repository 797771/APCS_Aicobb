import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
/**
 * MMMRunner
 *
 * @author (Isabelle Cobb)
 * @version (9/10)
 */
public class MMMRunner
{
    ArrayList<Integer>nums = new ArrayList<Integer>();; //create arraylist nums

    /**
     * Constructor for objects of class MMMRunner
     */
    public MMMRunner()
    {

    }

    //picks random numbers for arraylist nums
    public void loadArray(){
        for(int i=0; i < 100; i++){
            nums.add((int)(Math.random()*10) + 1);
        }
    }

    //prints out arraylist in lines of 10
    public void printArray(){
        System.out.println("ArrayList: ");
        for(int index = 9; index<100; index+=10){
            for(int i=index-9; i<=index; i++){
                if(i<index){
                    System.out.print(nums.get(i) + ", ");
                }

                if(i==index & i!= 99){
                    System.out.println(nums.get(i) + ", ");
                }

                if(i==index & i==99){
                    System.out.println(nums.get(i));
                }
            }
        }
    }

    //returns sum of numbers in arraylist
    public int getSum(){
        int sum = 0;
        for(int i=0; i<nums.size();i++){
            sum += nums.get(i);
        }

        System.out.println("Sum: " + sum);
        return(sum);
    }

    //gives mean value of arraylist
    public double getMean(){
        int sum = 0;
        for(int i=0; i<nums.size();i++){
            sum += nums.get(i);
        }
        
        System.out.println("Mean: " + sum/nums.size());
        return (sum/nums.size());
    }

    //gives median value of arraylist
    public double getMedian(){
        Collections.sort(nums);
        double median = (nums.get(49) + nums.get(50))/2;
        
        System.out.print("Median: " + median);
        return(median);
    }
}
