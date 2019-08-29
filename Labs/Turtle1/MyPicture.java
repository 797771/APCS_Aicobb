import java.awt.*;
/**
 * MyPicture
 * 
 * @author (Isabelle Cobb) 
 * @version (8/29)
 */
public class MyPicture
{
    public static void main(){
        Turtle   t;

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);

        t.jumpTo(0, 0);
        win.add(t);
        win.setVisible(true);
        t.penSize(3);
        size     = 50;    //logical units
        turn     =160;    //in degree
        t.penColor(Color.blue);
        for(int i = 0; i < 10; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.jumpTo(10, 20);
        t.heading(0);
        size     = 60;
        t.penColor(Color.red);
        t.penSize(2);
        turn     = 155;

        for(int i = 0; i < 10; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }

        for(int x = 10; x <= 10; x = x-40){
            t.jumpTo(x, 20);
            t.heading(0);
            size     = 60;
            t.penColor(Color.green);
            t.penSize(2);

            for(int i = 0; i < 10; i++){
                t.move( size ); 
                t.turn( turn );
                String n = ""+i;
                //t.print(n);
            }
        }

       
        t.hide();
    }
}