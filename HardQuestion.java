class HardQuestion implements ControlStrategy
{

	@Override
	public Question getNextQuestion(QuizModel model) 
	{
		
		return model.getHardQuestion();
	}
	
}
