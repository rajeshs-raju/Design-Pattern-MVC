
public class QuizView 
{
    public void printQuestion(Question question) 
    {
        String[] answers = question.getAnswers();
        System.out.println(question.getQuestion() + "\n");
        System.out.println("A: " + answers[0]);
        System.out.println("B: " + answers[1]);
        if(!(answers.length==2))
        {
        	System.out.println("C: " + answers[2]);
        	System.out.println("D: " + answers[3]);
        }
       
        
    }


    public void printScoreOfPlayer(String name,int score,int noaq,int noq ) 
    {
        System.out.println(name + " has reached " + score + " points.");
        System.out.println("Total no. of Questions "+noq+" Correctly answered "+noaq);
    }


    public void printNameRequest() {
        System.out.print("Your name: ");
    }

    public void printInputRequest() {
        System.out.print("Please chose a letter: ");
    }

    public void printSuccessMessage() {
        System.out.println("That was right!\n");
    }

    public void printWrongMessage() {
        System.out.println("This was wrong.");
    }
    public void printGameOver()
    {
    	System.out.println("Game Over!");
    }
    public void quitGame()
    {
    	System.out.println("Quit? Are you sure?[y/n]);");
    }
}