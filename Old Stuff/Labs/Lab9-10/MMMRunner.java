import java.util.Arrays;
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
        for(int i=0; i<nums.length; i++){
            nums[i] = (int) (Math.random()*10) + 1;
        }
    }
    
    
    //come back to this
    public void printArray(){
        for(int i=0; i<nums.length; i++){
            
        }
    }
    
    
    //returns sum of numbers in array
    public int getSum(){
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
        }
        
        return sum;
    }
    
    
    //gives mean value of array
    public double getMean(){
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
        }
        
        return (sum/nums.length);
    }
    
    //gives median value of array
    public double getMedian(){
        Arrays.sort();
        double median = (nums[49] + nums[50])/2;
        return(median);
    }
    
    //gives mode value of array
    public int getMode(){
        
    }
}
