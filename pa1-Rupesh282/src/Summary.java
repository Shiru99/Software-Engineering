import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Summary {
	private String filepath;
	private String delimiter;
	private int wordLengthTH;
	private String contents;

	private Map<String, String> converter = new HashMap<String, String>(){{
			put(".", "\\.");
		}};

	public Summary(String filepath, String delimiter, int wordLengthTH) {
		this.filepath = filepath;
		this.delimiter = converter.getOrDefault(delimiter, delimiter);
		this.wordLengthTH = wordLengthTH;
		this.contents = getFileContents().replace('\n', ' ').trim();
	}

	private int countWords(String contents) {
		String[] words = contents.trim().split(" ");
		//to count the number of words according the minimum decided length of the word
		//i.e if word has minimum length wordLengthTH , it will be counted.
		int wordCount = 0;
		for(String i : words)
			wordCount += (i.length() >= wordLengthTH ? 1 : 0);
		return wordCount;
	}

	private int countSentences(String contents) {
		//couting number of sentences in our file
		String[] sentences = contents.trim().split(delimiter);
		return ((sentences[0] != "" || sentences.length > 1) ? sentences.length: 0);
	}

	private String getFileContents() {
		String contents = "";

		// Read all contents from file
		try {
			File file = new File(filepath);
			Scanner fileReader = new Scanner(file);
			
			while (fileReader.hasNextLine()) 
				contents += ("\n" + fileReader.nextLine());
			
			fileReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found " + filepath);
		}

		return contents;
	}

	public int getWordCount() {
		return this.countWords(this.contents);
	}

	public int getSentenceCount() {
		return this.countSentences(this.contents);
	}

	public int getAvgLength() {
		return (getSentenceCount() > 0 ? getWordCount()/ getSentenceCount() : 0);
	}
}
