class MediumQuestion implements ControlStrategy
{

	@Override
	public Question getNextQuestion(QuizModel model) 
	{
		
		return model.getMediumQuestion();
	}
	
}