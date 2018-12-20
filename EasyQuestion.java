class EasyQuestion implements ControlStrategy
{

	@Override
	public Question getNextQuestion(QuizModel model) 
	{
		
		return model.getEasyQuestion();
	}
	
}