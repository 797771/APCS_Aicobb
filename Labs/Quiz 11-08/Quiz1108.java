import java.util.*;
/**
 * Quiz1108
 *
 * @author (Isabelle Cobb)
 * @version (11/8/2019)
 */
public class Quiz1108
{

    /**
     * Constructor for objects of class Quiz1108
     */
    public Quiz1108()
    {
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> n1 = makeList(x);
        int[] y = reverseList(n1);
        printList(n1);
        printArray(y);
    }

    /*
     * takes in array of ints and returns arraylist of Integer
     * objects with same values
     */
    public ArrayList<Integer> makeList(int[] nums){ 
        ArrayList<Integer> switchList = new ArrayList<Integer>();
        for(int i = 0; i<nums.length;i++){
            switchList.add(nums[i]);
        }
        return switchList;
    }

    /*
     * takes in an arraylist of Integer objects and returns
     * an array with same values but in reverse order
     */
    public int[] reverseList(ArrayList<Integer> nums){ 
        int[] reverseArr = new int[nums.size()];
        for(int i = 0; i<nums.size();i++){
            reverseArr[i] = nums.get((nums.size()-1)-i);
        }
        return reverseArr;
    }

    //prints ArrayList
    public void printList(ArrayList<Integer> a){
        System.out.print("\nArrayList: ");
        for(int i = 0; i<a.size();i++){
            System.out.print(a.get(i) + ", ");
        }
    }

    //prints Array
    public void printArray(int[] a){
        System.out.print("\nArray: ");
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+ ", ");
        }
    }

    public static void main(){
        Quiz1108 q = new Quiz1108();
    }
}

