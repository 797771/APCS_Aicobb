
/**
 * BreadCrumb
 * 
 * @author (Isabelle Cobb) 
 * @version (9/5)
 */
public class BreadCrumb
{
    public void BreadCrumb(Maze maze, MazeBot mazeBot){
        BreadCrumb crumb1 = new BreadCrumb();

        if(mazeBot.canMoveForward()== false){
            mazeBot.setBreadCrumbObject(crumb1);
        }
    }
}
