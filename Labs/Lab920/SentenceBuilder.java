
/**
 * SentenceBuilder
 *
 * @author (Isabelle Cobb)
 * @version (9/20)
 */
public class SentenceBuilder
{
    String[] noun = {"dog","sushi","softball","book","homework","computer","tree","monkey","cloud","shirt"};
    String[] verb = {"runs","eats","flies","watches","turns","surfs","talks","frowns","waves","jumps"};
    String[] adj = {"weird","funny","strange","peculiar","strong","fat","skinny","tall","flexible","naive"};
    String[] det = {"the","my","your","his","her","their","our","Kieran's","Emily's","Rango's","its","Mrs.Burbank's","Mr.Ettlin","some","this"};
    String[] adv = {"warily","slowly","carefully","sadly","fearfully","abruptly","beautifully","delicately","firmly","truthfully","lightly"};
    String[] prep = {"below","close to","around","beneath","above","away from","parallel to","across from","in","perpendicular to"};

    String sentence = "";
    
    /**
     * Constructor for objects of class SentenceBuilder
     */
    public SentenceBuilder()
    {

    }
    
    
    //methods to print a sentence
    public void loadSentences(){
        sentence = (getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase());
    }

    public String getSentence(){
        return (sentence);
    }

    //methods to return phrases
    public String getNounPhrase(){
        return(getRandomDeterminer() + " " + getRandomAdjective() + " " +getRandomNoun()+ " ");
    }

    public String getVerbPhrase(){
        return(getRandomAdverb() + " " + getRandomVerb() + " ");
    }

    public String getPrepositionalPhrase(){
        return(getRandomPreposition() + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun() + " ");
    }

    //methods to return random parts of speech
    public String getRandomNoun(){
        return noun[(int)(Math.random()*10)];
    }

    public String getRandomVerb(){
        return verb[(int)(Math.random()*10)];
    }

    public String getRandomAdjective(){
        return adj[(int)(Math.random()*10)];
    }

    public String getRandomAdverb(){
        return adv[(int)(Math.random()*10)];
    }

    public String getRandomDeterminer(){
        return det[(int)(Math.random()*10)];
    }

    public String getRandomPreposition(){
        return prep[(int)(Math.random()*10)];
    }

}
