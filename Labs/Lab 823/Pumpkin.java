
/**
 * Pumpkin Class
 * 
 * @author (Isabelle Cobb) 
 * @version (8/23)
 */
public class Pumpkin
{
    // instance variables 
    private double rad; //declare
    private int id; //declare

    //constructor for Pumpkin class
    public Pumpkin(double r, int id)
    {
        // initialize instance variables
        rad = r;
        this.id = id;
    }

    //methods
    public double getRadius(){
        return rad;
    }
}