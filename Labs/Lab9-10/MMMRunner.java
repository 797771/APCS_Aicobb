import java.util.Arrays;
import java.lang.Math;
/**
 * MMMRunner
 *
 * @author (Isabelle Cobb)
 * @version (9/10)
 */
public class MMMRunner
{
    int[] nums = new int[100]; //create array nums

    /**
     * Constructor for objects of class MMMRunner
     */
    public MMMRunner()
    {

    }

    //picks random numbers for array nums
    public void loadArray(){
        for(int i=0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10) + 1;
        }
    }

    //prints out array in lines of 10
    public void printArray(){
        for(int index = 9; index<100; index+=10){
            for(int i=index-9; i<=index; i++){
                if(i<index){
                    System.out.print(nums[i] + ", ");
                }

                if(i==index & i!= 99){
                    System.out.println(nums[i] + ", ");
                }

                if(i==index & i==99){
                    System.out.println(nums[i]);
                }
            }
        }
    }

    //returns sum of numbers in array
    public int getSum(){
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
        }

        System.out.println(sum);
        return(sum);
    }

    //gives mean value of array
    public double getMean(){
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
        }
        
        System.out.println(sum/nums.length);
        return (sum/nums.length);
    }

    //gives median value of array
    public double getMedian(){
        Arrays.sort(nums, 0, nums.length);
        double median = (nums[49] + nums[50])/2;
        
        System.out.print(median);
        return(median);
    }
}
