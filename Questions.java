import java.util.ArrayList;
import java.util.Random;

public class Questions 
{
    private ArrayList<Question> questions;
    public Question getRandomQuestion() 
    {
        Random random = new Random();
        int selection = random.nextInt(questions.size());
        return questions.get(selection);
    }
    
    public void addQuestions(ArrayList<Question> questions) 
    {
        this.questions = questions;
    }
    public void addQuestion(Question q)
    {
    	questions.add(q);
    }
}