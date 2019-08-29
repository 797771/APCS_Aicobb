
/**
 * StudentRunner
 *
 * @author (Isabelle Cobb)
 * @version (8/21)
 */
public class StudentRunner
{
    public static void main(){

        Student s1 = new Student("Isabelle", 765894206);
        System.out.println((s1.getName()) + ", your number is " + (s1.getNumber()) + ".");
        
        Student s2 = new Student("Emily", 8413965);
        System.out.println((s2.getName()) + ", your number is " + (s2.getNumber()) + ".");
    }
}
