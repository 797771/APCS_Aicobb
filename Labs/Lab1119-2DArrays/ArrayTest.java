import java.util.*;
/**
 * ArrayTest
 *
 * @author (Isabelle Cobb)
 * @version (11/19/19)
 */
public class ArrayTest
{

    private int size = 10;
    private int[][] nums = new int[size][size];

    /**
     * Constructor for objects of class ArrayTest
     */
    public ArrayTest()
    {
        printArray();
        rowMean();
        rowMedian();
        rowMode();
        allMean();
    }

    public static void main(){
        ArrayTest run = new ArrayTest();
    }

    public void loadArray(){
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                nums[r][c] = (int)(Math.random()*10)+1;
            }
        }
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

    public double sumAll(){
        double sum = 0;
        for(int r = 0; r<nums.length;r++){
            for(int c = 0; c<nums[r].length;c++){
                sum += nums[r][c];
            }
        }

        return sum;
    }

    public void allMean(){
        double allMean;

        allMean = sumAll()/(size*size);
        System.out.println("Mean of all values: " + allMean);
    }

    public void rowMean(){
        double rowSum;
        double rowMean;

        System.out.println("Row Means: ");
        for(int r = 0; r<nums.length;r++){
            rowSum = 0.0;
            rowMean = 0.0;
            for(int c = 0; c<nums[r].length;c++){
                rowSum += nums[r][c];
            }
            rowMean = rowSum/(nums[r].length);
            System.out.println(rowMean);
        }
    }

    public void rowMedian(){
        int [][] temp = nums;

        double median;
        double sumMid;
        System.out.println("Row Medians: ");
        for(int r = 0; r<nums.length;r++){
            median = 0.0;
            sumMid = 0.0;

            bubbleSort(temp[r]);
            for(int c = 0; c<nums[r].length;c++){
                sumMid = nums[r][(nums[r].length-1)/2] + nums[r][(nums[r].length/2)];
                median = sumMid/2;
            }
            System.out.println(median);
        }
    }

    /*
     * create array of 10 values
     * each index of array corresponds to that number in row
     * if that value exists in row, add 1 to the same index
     * at end of loop, find highest value in array and print out the index of that value
     */
    public void rowMode(){
        System.out.println("Row Modes: ");
        for(int r = 0; r<nums.length;r++){
            int[] vals = new int[size+1];
            ArrayList<Integer> mode = new ArrayList<Integer>();
            
            for(int c = 0; c<nums[r].length;c++){
                vals[nums[r][c]]++;
            }

            for(int i = 0; i<vals.length;i++){
                if(vals[i] == findGreatest(vals)){
                    mode.add(i);
                }
            }
            
            System.out.println(mode);
        }
    }

    public int findGreatest(int [] temp){
        int greatestVal = 0;

        for(int c = 0; c<temp.length;c++){
            if(temp[c] > greatestVal){
                greatestVal = temp[c];
            }
        }

        return greatestVal;
    }

    //sorts array using bubblesort(biggest num to the top)
    public static void bubbleSort(int[] x){

        for(int i=x.length-1; i>0; i--){
            for(int j = 0; j<i ;j++){
                if(x[j] > x[j+1]){
                    swapList(x, j, j+1);
                }
            }
        }

    }

    //swapping method
    public static void swapList(int[] y,int i, int n){
        int temp = y[i];
        y[i] = y[n];
        y[n] = temp;
    }
}
