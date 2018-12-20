
import java.util.Scanner;

public class QuizController 
{
    private Scanner input;
    private QuizModel model;
    private QuizView view;
    private boolean gameover=false;
    ControllerContex cons;
    
    

    public QuizController(QuizModel model, QuizView view,Levels level) 
    {
        this.model=model;
        input = new Scanner(System.in);
        this.view = view;
        switch(level)
        {
        case EASY:
        	cons=new ControllerContex(new EasyQuestion());
        case MEDIUM:
        	cons=new ControllerContex(new MediumQuestion());
        case HARD:
        	cons=new ControllerContex(new HardQuestion());
        default:
        	cons=new ControllerContex(new RandomQuestion());
        }
    }

    public String getString() 
    {
        return input.next();
    }

    public String getGuessOfPlayer() 
    {
    	String guess = input.next();
    	
        while(!guess.equalsIgnoreCase("A") && !guess.equalsIgnoreCase("B")&& !guess.equalsIgnoreCase("C") && !guess.equalsIgnoreCase("D") && !gameover ) 
        {
            view.quitGame();
            if(input.next().equalsIgnoreCase("Y"))
            	gameover=true;
            else
            	guess=input.next();
            		
        }
        return guess;
    }
    
    public void start() 
    {
        view.printNameRequest();
        model.addPlayer(getString());

        while(true) 
        {
            Question actualQuestion = cons.getNextQuestion(model);
            view.printQuestion(actualQuestion);
            view.printInputRequest();
            String input = getGuessOfPlayer();
            if(gameover)
            	break;
            if(model.evaluvate(actualQuestion, input))
            	view.printSuccessMessage();
            else
            	view.printWrongMessage();
            
        }
        view.printGameOver();
        view.printScoreOfPlayer(model);
    }
}
