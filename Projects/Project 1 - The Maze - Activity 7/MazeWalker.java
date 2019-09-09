
/**
 * MazeWalker
 *
 * @author (Isabelle Cobb)
 * @version (9/3)
 */
public class MazeWalker
{

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
    }

    //initialize breadcrumbs
    BreadCrumb crumb1 = new BreadCrumb(); 

    //method to control Turtle
    public void walkMaze(Maze maze, MazeBot mazeBot){
        while(mazeBot.didReachGoal()==false){
            if(mazeBot.canMoveForward()==true){
                mazeBot.moveForward();
            }

            if((mazeBot.canMoveForward()==false) & (mazeBot.getBreadCrumbObject()!=null)){
                mazeBot.turnRight();

                if(mazeBot.canMoveForward()==false){
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
                }
            }

            if((mazeBot.canMoveForward()==false) & (mazeBot.getBreadCrumbObject()==null)){
                mazeBot.turnRight();

                if(mazeBot.canMoveForward()==false){
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
                    if(mazeBot.canMoveForward()==false){
                        mazeBot.turnLeft();
                        mazeBot.moveForward();
                        mazeBot.setBreadCrumbObject(crumb1);
                    }
                }
            }

        }

        if(mazeBot.didReachGoal()==true){
            mazeBot.signalSuccess();
        }
        else{
            mazeBot.signalError();
        }
    }

    //method to eliminate MyFirstProgram
    public static void run(){
        Maze maze = new Maze(2);
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }

}