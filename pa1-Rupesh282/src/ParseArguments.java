// import java.io.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class ParseArguments {
    // private String filename;
    // private String delimiter;

    public ParseArguments(String[] args) {
        try {
            String arg = args[0];           // ArrayIndexOutOfBoundsException 
            if (arg.equals("--team")) {
                System.out.println();
                teamInfo();
                System.out.println();
                System.exit(0);
            } else if (arg.equals("--help")){
                System.out.println();
                manual();
                System.out.println();
                System.exit(0);
            } 
            // else {

                // Checker check = new Checker(args);
                // check.isChecked();

                // String filePath = args[0];
                // File file = new File(filePath);

                // // check if file exists
                // if(!file.exists()) {
                //     System.out.println("file doesn't exists at file path : " + filePath);
                //     System.exit(0);
                // }

                // //default delimiter is '.'
                // String Delimiter = ".";
                // if(args.length > 1) {
                //     Delimiter = args[1];
                // }

                // //set the filename and Delimiter
                // setFilename(filePath);
                // setDelimiter(Delimiter);
            // }
        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            //In case user doesn't provide any arguments to jar file
//            System.out.println("\nPlease Enter arguments !\t(For more help, use '--help' tag)\n");
            System.out.println(e);
            System.exit(-1);
        }
    }

    

    // public void setDelimiter(String delimiter) {
    //     this.delimiter = delimiter;
    // }

    // public String getFilename() {
    //     return this.filename;
    // }

    // public String getDelimiter() {
    //     return this.delimiter;
    // }

    private void teamInfo() {
        System.out.println("<< Team Info >>\n");
        System.out.println("Team Name : Software Fighters");
        System.out.println("\nMembers : ");
        System.out.println("\tManjeet Kapil (180010021) ");
        System.out.println("\tHarsh Raj (180010017) ");
        System.out.println("\tShriram Ghadge (180010015) ");
        System.out.println("\tRupesh Kalantre (180010029) ");
    }

    private void manual() throws FileNotFoundException {
        System.out.println("---------    MANUAL    ----------\n");
        String manual = "About Program :  \n\tA java based command line tool to find the average length of words per sentence present in the given file.\n" +
                "Synopsis :  \n\tjava -jar <PATH TO JAR FILE> <PATH TO YOUR ESSAY FILE> -d <DELIMITER> -l <MINIMUM WORD LENGTH>" +
                "\n\tjava -jar <PATH TO JAR FILE> --help" +
                "\n\tjava -jar <PATH TO JAR FILE> --team\n" +
                "Options : " +
                "\n\tArguments : \n" +
                "\n\t1 ) Path to jar file" +
                "\n\t\t> Description : this denote the relative path jar file, \n\t\t\t\twhich contains the bundled code to be executed." +
                "\n\t\t> Optional    : No" +
                "\n\t\t> Default     : NA" +
                "\n" +
                "\n\t2 ) Path to essay file" +
                "\n\t\t> Description : this denote the relative essay jar file, \n\t\t\t\twhose contents is to be evaluated." +
                "\n\t\t> Optional    : No" +
                "\n\t\t> Default     : NA" +
                "\n" +
                "\n\t3 ) Delimiter" +
                "\n\t\t> Description : this denotes the delimiter which will \n\t\t\t\tbe considered as end of an sentence.Also it should be a single character." +
                "\n\t\t\t\tIn command line, You should specify -d flag as shown above before giving this argument." +
                "\n\t\t> Optional    : Yes" +
                "\n\t\t> Default     : '.'" +
                "\n" +
                "\n\t4 ) Minimum word Length" +
                "\n\t\t> Description : Only those words will be counted \n\t\t\t\twhich have specified minimum word length.It should be a positive integer." +
                "\n\t\t> Optional    : Yes" +
                "\n\t\t> Default     : 4" +
                "\n" +
                "\n\t5 ) --help" +
                "\n\t\t> Description : This prints help/ manpage for executing the program." +
                "\n\t\t> Optional    : Yes" +
                "\n\t\t> Default     : NA" +
                "\n" +
                "\n\t6 ) --team" +
                "\n\t\t> Description : This prints the team details." +
                "\n\t\t> Optional    : Yes" +
                "\n\t\t> Default     : NA\n";
        System.out.println(manual);
        System.out.println("\n--------- END OF MANUAL ----------");
    }
}
