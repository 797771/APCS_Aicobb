
/**
 * Runner
 *
 * @author (Isabelle Cobb)
 * @version (9/20)
 */
public class Runner
{

    /**
     * Constructor for objects of class Runner
     */
    public Runner()
    {

    }

    public static void main(){
        SentenceBuilder run = new SentenceBuilder();
        run.loadSentences();
        System.out.println(run.getSentence());
    }

}

