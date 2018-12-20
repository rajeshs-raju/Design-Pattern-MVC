import java.util.ArrayList;


public class Game 
{
    public static void main(String[] args) 
    {
        QuizView view=new QuizView();
        QuizModel model=new QuizModel();
        initGame(model);
        QuizController controller = new QuizController(model,view,Levels.EASY);
        controller.start();
    }
    
    
    static void initGame(QuizModel model)
    {
    	 Question[] questionList = {
    			 Question.addQuestion("what is the size of int in java",
    		      new String[] {
    		                    "4 Byte",
    		                    "2 Byte",
    		                }, "A",Levels.EASY),
    			 
    			 Question.addQuestion("Which one of the following is an application of Stack Data Structure?",
    					 new String[] {
    							"Managing function calls",
    		                    "The stock span problem",
    		                    "Arithmetic expression evaluation",
    		                    "All of the above"
    		                }, "D",Levels.HARD),
                
    			 
    			Question.addQuestion("If malloc() successfully allocates memory it returns the number of bytes it has allocated.?",
                new String[] {
                    "True",
                    "False",
                }, "B",Levels.MEDIUM),
    			
    			Question.addQuestion("Is there easy way to print enumeration values symbolically?",
    	                new String[] {
    	                    "Yes",
    	                    "No",
    	                }, "B",Levels.HARD),

    			 
                 Question.addQuestion("In which country Kaiser Wilhelm II was born?",
                new String[] {
                    "America",
                    "Germany",
                    "North Korea",
                    "England"
                }, "B",Levels.EASY),
                 

                 Question.addQuestion("Which flowers are the most beautiful?",
                new String[] {
                    "Tulips",
                    "Roses",
                    "Lilies",
                    "Weeping willows"
                }, "C",Levels.HARD),

                 Question.addQuestion("Where does England live?",
                new String[] {
                    "On an island",
                    "Near poland",
                    "In the white house",
                    "In he yellow house"
                }, "A",Levels.HARD),

                 Question.addQuestion("Who's a free software activist?",
                new String[] {
                    "Bill Gates",
                    "Donald Trump",
                    "Richard Stallman",
                    "The GNU operating system"
                }, "C",Levels.MEDIUM),

                 Question.addQuestion("Which MMORPG has the most players?",
                new String[] {
                    "Arthoria.de",
                    "Nostale",
                    "GTA 5",
                    "World of Warcraft"
                }, "D",Levels.EASY)
            };
            
            ArrayList<Question> list=new ArrayList<Question>();
            
            for(Question q:questionList)
            {
            	list.add(q);
            }
    	model.addQuestions(list);
    }
}