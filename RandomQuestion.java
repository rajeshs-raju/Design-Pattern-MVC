class RandomQuestion implements ControlStrategy
{

	@Override
	public Question getNextQuestion(QuizModel model) 
	{
		
		return model.getNextQuestion();
	}
	
}