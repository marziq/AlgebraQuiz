import java.util.Scanner;
import java.io.*;

public class Alegbra2 {

	public static void main(String[] args)throws IOException {
		String[] questions = new String[10];
		String[] answer = new String[10];
		//File data = new File ("Questions.txt "); 
	    //data.createNewFile(); 
		int marks;
		greetings();
		readQuestions(questions);
		readAns(answer);
	    marks = userInput(questions,answer);
	    
	    //marks system
	    if(marks >= 7) 
	    	System.out.println("\nRank: Excellent");
	    else if (marks >= 4 && marks < 7)
	    	System.out.println("\nRank: Average");
	    else
	    	System.out.println("\nRank: Poor");
	    
	}
	static void greetings() {
          System.out.println(" \n WELCOME TO CARAMEL ALGEBRA QUIZ !");
          System.out.println(" ============================================= ");
	  System.out.println(" This quiz will test your knowledge of basic algebra concepts");
	  System.out.println(" Are you ready to get started ? ");
          System.out.println(" LET'S GO !!! ");
          System.out.println(" =============================================\n\n ");

	}
	static void readQuestions(String[] quest)throws IOException {
		int i = 0;
		File questions = new File("Questions.txt");		
		Scanner read = new Scanner(questions);
		
		while (read.hasNextLine()) {
			quest[i] = read.nextLine();
			i++;
		}
	    read.close();   
	}
	static void readAns(String[] answer)throws IOException {
		int i = 0;
		File ans = new File("Answer.txt");		
		Scanner input = new Scanner(ans);
		while (input.hasNextLine()) {
			answer[i] = input.nextLine();
			i++;
		}
		input.close();
	}
    static int userInput(String[] questions, String[] answer) {
    	String userAns;
    	int marks = 0;
    	Scanner input = new Scanner(System.in);
    	int i = 0;
    	while(i < questions.length) {
    		System.out.println( (i+1) + ")Questions: " + questions[i]);
    		System.out.print("Answer: ");
    		userAns = input.next();
    		if(userAns.equalsIgnoreCase(answer[i]))
    			marks += 1;
    		i++;
    	}
    	input.close();
    	return marks;
    	
    }
}
