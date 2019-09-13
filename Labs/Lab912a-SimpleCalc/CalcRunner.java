
/**
 * CalcRunner
 *
 * @author (Isabelle Cobb)
 * @version (9/12)
 */
public class CalcRunner
{
    public CalcRunner(){
        
    }
    
    public static void main(){
        SimpleCalc run = new SimpleCalc(12, 4);
        run.add();
        run.subtract();
        run.multiply();
        run.divide();
        run.moduloDivide();
    }
}
