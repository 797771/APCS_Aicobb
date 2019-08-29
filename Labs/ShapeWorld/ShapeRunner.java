
/**
 * ShapeRunner Class
 * 
 * @author (Isabelle Cobb) 
 * @version (8/23)
 */
public class ShapeRunner
{
    //main method
    public static void main(){
        //create canvas
        ShapeWorld shapeWorld = new ShapeWorld(800, 600);
        
         //colors
        APCSColor blue = new APCSColor(0,0,1);
        APCSColor red = new APCSColor(1,0,0);
        APCSColor green = new APCSColor(0,1,0);
        APCSColor purple = new APCSColor(1,0,1);
        APCSColor yellow = new APCSColor(1,1,0);
        APCSColor teal = new APCSColor(0,1,1);
        
        //draw circle
        APCSCircle circle1 = new APCSCircle(300, 180, 50);
        shapeWorld.addCircle(circle1);
        circle1.setFillColor(teal);
        
        //draw rectangle for body
        APCSRectangle rect1 = new APCSRectangle(350, 170, 550, 250);
        shapeWorld.addRectangle(rect1);
        rect1.setFillColor(blue);
        
        //draw lines for legs
        APCSLine line1 = new APCSLine(350, 250, 340, 320);
        shapeWorld.addLine(line1);
        
        APCSLine line2 = new APCSLine(370, 250, 380, 320);
        shapeWorld.addLine(line2);
        
        APCSLine line3 = new APCSLine(530, 250, 520, 320);
        shapeWorld.addLine(line3);
        
        APCSLine line4 = new APCSLine(548, 250, 560, 320);
        shapeWorld.addLine(line4);
        
        //draw lines for tail
        APCSLine line5 = new APCSLine(548, 190, 590, 190);
        shapeWorld.addLine(line5);
        
        APCSLine line6 = new APCSLine(589, 190, 600, 180);
        shapeWorld.addLine(line6);
        
        //draw triangles for ears
        APCSTriangle triangle1 = new APCSTriangle(250, 170, 265, 110, 280, 140);
        shapeWorld.addTriangle(triangle1);
        
        APCSTriangle triangle2 = new APCSTriangle(319, 140, 334, 110, 349, 170);
        shapeWorld.addTriangle(triangle2);
        
   
        
    }
}