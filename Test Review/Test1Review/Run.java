
/**
 * Run
 *
 * @author (Isabelle Cobb)
 * @version (9/12)
 */
public class Run
{

    /**
     * Constructor for objects of class Run
     */
    public Run()
    {

    }

    public static void main(){
        //question 1 
        Question1 run = new Question1();
        run.runNum();
        
        //question 3
        Numbers num = new Numbers(3, 2);
        num.multiply();
        
        // question 4
        Question4 run2 = new Question4();
        run2.getLength(57);
        run2.getSum(1);
        
        // question 5
        Question5 move = new Question5(-6);
        move.sumDigits();
        
        //question 6
        Question6 run3 = new Question6(10, 2);
        run3.add();
        run3.subtract();
        run3.multiply();
        run3.divide();
        
        //question 7
        Question7 run4 = new Question7();
        run4.equal();
        
        //question 8
        Question8 run5 = new Question8();
        run5.msg();
        
        //question 10
        Question10 run6 = new Question10();
        run6.printArray();
        
        //question 11
        Question11 run7 = new Question11();
        run7.arraySum();
        
        //question 12
        Question12 run8 = new Question12();
       int[] firstArray = {9,0,4,6};
       int[] newArray = run8.copyArray(firstArray);
       run8.printArray(newArray);
    }
}
