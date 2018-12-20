

public abstract class Question
{
    abstract String getQuestion();
    abstract String[] getAnswers();
    abstract boolean check(String letter);
    abstract public int getMarks();
    Levels level;
	public static Question addQuestion(String question, String[] answers, String correctAnswerLetter,Levels l)
	{
		Question temp = null;
		switch(l)
		{
		case EASY:
			if(answers.length==2)
				temp=new YNQuestion(question,answers,correctAnswerLetter,1,Levels.EASY);
			else
				temp=new MQuestion(question,answers,correctAnswerLetter,1,Levels.EASY);
		case MEDIUM:
			if(answers.length==2)
				temp=new YNQuestion(question,answers,correctAnswerLetter,2,Levels.MEDIUM);
			else
				temp=new MQuestion(question,answers,correctAnswerLetter,2,Levels.MEDIUM);
		case HARD:
			if(answers.length==2)
				temp=new YNQuestion(question,answers,correctAnswerLetter,4,Levels.HARD);
			else
				temp=new MQuestion(question,answers,correctAnswerLetter,4,Levels.HARD);
			
		}
		return temp;
	}

}

class YNQuestion extends Question
{
    private String question;
    private String[] answers;
    private String correctAnswerLetter;
    private int marks;
    public YNQuestion(String question, String[] answers, String correctAnswerLetter,int marks,Levels level) 
    {
        if(!correctAnswerLetter.equalsIgnoreCase("A") && !correctAnswerLetter.equalsIgnoreCase("B")) 
        {
           throw new IllegalArgumentException("the letter representing the correct" +
           " string can only have a value from A and B");
        }
        this.level=level;
        this.question = question;
        this.answers = answers;
        this.marks=marks;
        this.correctAnswerLetter = correctAnswerLetter;
    }

    public String getQuestion() 
    {
        return question;
    }
    public String[] getAnswers() 
    {
        return answers;
    }
    public boolean check(String letter) 
    {
        return letter.equalsIgnoreCase(correctAnswerLetter);
    }
    public int getMarks()
    {
    	return marks;
    }
}

class MQuestion extends Question
{
    private String question;
    private String[] answers;
    private String correctAnswerLetter;
    private int marks;
    public MQuestion(String question, String[] answers, String correctAnswerLetter,int marks,Levels level) 
    {
        if(!correctAnswerLetter.equalsIgnoreCase("A") && !correctAnswerLetter.equalsIgnoreCase("B")
        && !correctAnswerLetter.equalsIgnoreCase("C") && !correctAnswerLetter.equalsIgnoreCase("D")) {
           throw new IllegalArgumentException("the letter representing the correct" +
           " string can only have a value from A to D");
        }
        this.level=level;
        this.marks=marks;
        this.question = question;
        this.answers = answers;
        this.correctAnswerLetter = correctAnswerLetter;
    }

    public String getQuestion() 
    {
        return question;
    }
    public String[] getAnswers() 
    {
        return answers;
    }
    public boolean check(String letter) 
    {
        return letter.equalsIgnoreCase(correctAnswerLetter);
    }
    public int getMarks()
    {
    	return marks;
    }
}




