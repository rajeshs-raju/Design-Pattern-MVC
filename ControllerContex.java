public class ControllerContex 
{
	private ControlStrategy cons;
	
	ControllerContex(ControlStrategy cons)
	{
		this.cons=cons;
	}
	
	Question getNextQuestion(QuizModel model)
	{
		return cons.getNextQuestion(model);
	}
	
}
