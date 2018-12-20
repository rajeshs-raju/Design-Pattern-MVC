
public class Player 
{
    private String name;
    private int score;
    private int count;
    private int correct;
    
    public Player(String name) 
    {
        this.name = name;
        score = 0;
    }

    public String getName() 
    {
        return name;
    }

    public int getScore() 
    {
        return score;
    }
    public void scorePoint(int marks) 
    {
        score+=marks;
        correct++;
    }
    public int noAttendQuestions()
    {
    	return count;
    }
    public void countQuestions()
    {
    	count++;
    }
    public int getCount()
    {
    	return count;
    }
    public int correctQuestions()
    {
    	return correct;
    }
    
}