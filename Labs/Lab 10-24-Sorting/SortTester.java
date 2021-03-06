import java.util.*;
/**
 * SortTester
 *
 * @author (Isabelle Cobb)
 * @version (10/21/19)
 */
public class SortTester
{
    private static ArrayList<Integer> numList = new ArrayList<Integer>();
    private static int swapCount = 0;
    private static int compCount = 0;

    /**
     * Constructor for objects of class SortTester
     */
    public SortTester()
    {
    }
    
    //load arraylist
    public static void loadNumbers(ArrayList<Integer> x, int n){
        numList.clear();
        for(int i = 0; i<n; i++){
            x.add((int)(Math.random()*100)+1);
        }
    }
    
    
    //sorts arraylist using bubblesort
    public static void bubbleSort(ArrayList<Integer> x){
        swapCount = 0;
        compCount = 0;
        for(int i=x.size()-1; i>0; i--){
            for(int j = 0; j<i ;j++){
                    if(x.get(j) > x.get(j+1)){
                        swapList(x, j, j+1);
                        swapCount++;
                    }
                    compCount++;
            }
        }
        System.out.println(x);
        System.out.println("Swap count: " + swapCount);
        System.out.println("Compare count: "+ compCount);
    }
    
    //swapping method
        public static void swapList(ArrayList<Integer> y,int i, int n){
        int temp = y.get(i);
        y.set(i, y.get(n));
        y.set(n, temp);
    }
    
    //sorts arraylist using insertion sort
    public static void insertSort(ArrayList<Integer> x){
        swapCount = 0;
        compCount = 0;
        for(int i=1; i<x.size(); i++){
            int j = i;
            while(j>0 && (x.get(j) < x.get(j-1))){
                    swapList(x,j, j-1);
                    swapCount++;
                    compCount++;
                    j--;
            }
            compCount++;
        }
        System.out.println(x);
        System.out.println("Swap count: "+ swapCount);
        System.out.println("Compare count: " + compCount);
    }
    
    //sorts arraylist using selectionsort
    public static void selectSort(ArrayList<Integer> x){
        swapCount = 0;
        compCount = 0;
        for(int i=0; i<x.size()-1; i++){
            int index = i;
            for(int j=i+1;j<x.size();j++){
                if(x.get(j) < x.get(index)){
                    index = j;
                }
                compCount++;
            }
            swapList(x, index, i);
            swapCount++;
        }
        
        System.out.println(x);
        System.out.println("Swap count: "+ swapCount);
        System.out.println("Compare count: " + compCount);
    }
    
    //prints results
    public static void printList(){
        
        //prints results for bubblesort
        loadNumbers(numList, 10);
        System.out.println("\nBubble-Sorted ArrayList: ");
        bubbleSort(numList);
        
        //prints results for insertionsort
        loadNumbers(numList, 10);
        System.out.println("\nInsertion-Sorted ArrayList: ");
        insertSort(numList);
        
        //prints results for insertionsort
        loadNumbers(numList, 10);
        System.out.println("\nSelection-Sorted ArrayList: ");
        selectSort(numList);
    }
}
