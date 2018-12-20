import java.util.ArrayList;

interface AdapterQuestions
{
	public Questions questions=new Questions();
}


public class QuizModel implements AdapterQuestions 
{
	private Player player;
	
	public QuizModel() {
		// TODO Auto-generated constructor stub
	}
	public void addQuestions(ArrayList<Question> list)
	{
		questions.addQuestions(list);
	}
	public void addQuestion(Question q)
	{
		questions.addQuestion(q);
	}
	
	public void addPlayer(String playername)
	{
		player=new Player(playername);
	}
	
	public Question getNextQuestion()
	{
		return questions.getRandomQuestion();
	}
	
	public boolean evaluvate(Question q,String ans)
	{
		player.countQuestions();
		if(q.check(ans))
		{
			player.scorePoint(q.getMarks());
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public int getPlayerScore()
	{
		return player.getScore();
	}
	public int getPlayerTotalQuestions()
	{
		return player.getCount();
	}
	public int getPlayerAttendQuestions()
	{
		return player.correctQuestions();
	}
	public String getPlayerName()
	{
		return player.getName();
	}
	public Question getMediumQuestion() 
	{
		Question q=questions.getRandomQuestion();
		while(q.level!=Levels.MEDIUM)
			q=questions.getRandomQuestion();
		return q;
	}
	public Question getEasyQuestion() 
	{
		Question q=questions.getRandomQuestion();
		while(q.level!=Levels.EASY)
			q=questions.getRandomQuestion();
		return q;
	}
	public Question getHardQuestion() 
	{
		Question q=questions.getRandomQuestion();
		while(q.level!=Levels.HARD)
			q=questions.getRandomQuestion();
		return q;
	}
}
