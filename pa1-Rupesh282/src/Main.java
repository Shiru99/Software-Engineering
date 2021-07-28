import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ParseArguments parser = new ParseArguments(args);
		Checker check = new Checker(args);
		if(check.isChecked()){
			
			Summary sm = new Summary(check.getFilename(), check.getDelimiter(), check.getMinWordLength());
			System.out.println("\nFile used  \t\t\t: " + check.getFilename());//printing file used
			System.out.println("Delimiter used  \t\t: " + "'" + check.getDelimiter() + "'");//delimeter or we can say special character
			System.out.println("Minimum word Length set to be \t:  " + check.getMinWordLength());//min word lenth for not taking the words which are below this number in our calculation

			System.out.println("\nSummary: ");
			System.out.printf("\tNumber of words in your text                 : %d\n", sm.getWordCount());
			System.out.printf("\tNumber of sentences in your text             : %d\n", sm.getSentenceCount());
			System.out.printf("\tAverage length of each sentence in your text : %d\n\n", sm.getAvgLength());
		}
		
	}
}
