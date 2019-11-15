import java.util.*;
/**
 * GridTester
 *
 * @author (Isabelle Cobb)
 * @version (11/15/19)
 */
public class GridTester
{
    private int size = 10;
    private int[][] nums = new int[size][size];
    
    /**
     * Constructor for objects of class GridTester
     */
    public GridTester()
    {
        printArray();
        
        System.out.println("Sum: " + sumAll());
        System.out.println("Greatest Value: " + findGreatest());
        System.out.println("Number of times the greatest value exists: " + numOfGreatest());
        System.out.println("Average Value: " + findAvg());
    }

    public static void main(){
        GridTester test = new GridTester();
    }
    
    public void printArray(){
        loadArray();
        
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                System.out.print(nums[r][c] +", ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void loadArray(){
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                nums[r][c] = (int)(Math.random()*100)+1;
            }
        }
    }
    
    public int sumAll(){
        int sum = 0;
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                sum += nums[r][c];
            }
        }
        
        return sum;
    }
    
    public int findGreatest(){
        int greatestVal = 0;
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                if(nums[r][c] > greatestVal){
                    greatestVal = nums[r][c];
                }
            }
        }
        
        return greatestVal;
    }
    
    public int numOfGreatest(){//return number of times greatest value exists in array
        
        int numGreatest = 0;
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                if(nums[r][c] == findGreatest()){
                    numGreatest++;
                }
            }
        }
        
        
        return numGreatest;
    }
    
    public double findAvg(){
        int avg;
        avg = sumAll()/(size*size);

        return avg;
    }
}
