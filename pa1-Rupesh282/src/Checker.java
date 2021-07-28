import java.io.File;
import java.util.*;

public class Checker {

    public int minWordLength;
    private String filename;
    private String delimiter;
    private boolean Checked = false;

    public Checker(String[] args) {
            try {
            
                //default delimiter is '.'
                String Delimiter = ".";

                // default minWordLength is 4
                int minWordLength = 4;

                if(args.length > 5){
                    System.out.print("\nMore than required number of arguments !");
                    Help();
                    Warning();
                    System.exit(-1);
                }else if(args.length == 1){

                }
                else if(args.length == 2 || args.length == 4){
                    System.out.print("\nSome error in arguments ! (may be missing some arguments)");
                    Help();
                    Warning();
                    System.exit(-1);
                }
                else if(args.length == 3){
                    if(args[1].equals("--d")){
                        if(args[2].length() > 1) 
                            {
                                System.out.println("\nDelimiter must be a single character.");
                                System.out.print("Delimiter set by you - '" + args[2] + "'");
                                Help();
                                // System.out.print("*NOTE : <Space> can't be delimiter");
                                Warning();
                                System.exit(0);
                            }
                            Delimiter = args[2];
                        
                    }else if(args[1].equals("--l")){
                        try {
                            minWordLength = Integer.parseInt(args[2]);
                        } catch (NumberFormatException e) {
                            System.out.println("\nThe minimum word length you provided in the third argument is not an Integer !");
                            Help();
                            System.exit(-1);
                        }
                        if(minWordLength < 0) {
                            System.out.println("\nThe minimum word length you provided in the third argument can't be negative !");
                            Help();
                            System.exit(-1);
                        }

                    }else{
                        System.out.print("\nSome error in arguments !");
                        Help();
                        Warning();
                        System.exit(-1);
                    }
                }
                else if(args.length == 5){
                    if(args[1].equals("--d") && args[3].equals("--l")){
                        if(args[2].length() > 1) 
                            {
                                System.out.println("\nDelimiter must be a single character.");
                                System.out.print("Delimiter set by you - '" + args[2] + "'");
                                Help();
                                // System.out.print("*NOTE : <Space> can't be delimiter");
                                Warning();
                                System.exit(0);
                            }
                        Delimiter = args[2];

                        try {
                            
                            minWordLength = Integer.parseInt(args[4]);
                        } catch (NumberFormatException e) {
                            System.out.println("\nThe minimum word length you provided in the fifth argument is not an Integer !");
                            Help();
                            System.exit(-1);
                        }
                        if(minWordLength < 0) {
                            System.out.println("\nThe minimum word length you provided in the fifth argument can't be negative !");
                            Help();
                            System.exit(-1);
                        }

                    }else{
                        System.out.print("\nSome error in arguments !");
                        Help();
                        Warning();
                        System.exit(-1);
                    }
                }
                
                String filePath = args[0];
                String extension = filePath.substring(filePath.lastIndexOf('.') + 1);

                List<String> extensions = Arrays.asList("txt");

                if(! extensions.contains(extension.toLowerCase())){
                    System.out.println("\nOnly text format is allowed. Your file-address have extension : '" + extension +"'");
                    System.exit(0);
                }

                File file = new File(filePath);

                // check if file exists
                if(!file.exists()) {
                    System.out.println("\nFile doesn't exist at file path : '" +filePath+"'");
                    System.exit(0);
                }

                // EMPTY File
                if(file.length()==0){
                    System.out.println("\nEmpty File !!! \t(please add non-empty file)");
                    System.exit(0);
                }

                try {
                    String content = "";

                    Scanner fileReader = new Scanner(file);
                    
                    while (fileReader.hasNextLine()) 
                        content += ("\n" + fileReader.nextLine());
                    
                    fileReader.close();

                    // ////// lang detection for neglecting other languages such as chinese
                    
                    textIsEnglish(content);
                }
                catch(Exception e) {
                    System.out.println(e);
                }


                
                

                //set the filename and Delimiter
                setChecked(true);
                setFilename(filePath);
                setDelimiter(Delimiter);
                setMinWordLength(minWordLength);
                
            } catch (Exception e) {
                System.out.println(e);
        }

        
    }

    public void Warning() {
        //For Warning
        System.out.println("**Note : if file path contains space, Add '\\' before space OR Add complete file path in single quotes - '<FILE PATH>'");
    }

    public void Help() {
        //For help
        System.out.println("\t(For more help, use '--help' tag)\n");
    }

    public void setFilename(String fileName) {
        this.filename = fileName;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public boolean isChecked() {
        return Checked;
    }

    public void setChecked(boolean checked) {
        Checked = checked;
    }

    public void setMinWordLength(int minWordLength) {
        this.minWordLength = minWordLength;
    }

    public int getMinWordLength() {
        return this.minWordLength;
    }
    public static <T> void textIsEnglish(String text) {

        Map<String,Integer> lang = new HashMap<>();        


        for (char chars: text.toCharArray()) {
            lang.putIfAbsent(Character.UnicodeBlock.of(chars).toString(),1);
            lang.replace(Character.UnicodeBlock.of(chars).toString(),lang.get(Character.UnicodeBlock.of(chars).toString())+1);
        }
        
        Map<String,Integer> map = sortByValues(lang); 

        if(map.size()>2){
            System.out.println("\nWARNING : Text file is expected to be strictly in English. (Your text uses more than 1 languages) "+ "\nlanguages used in your text are : "+ map.keySet());
            System.out.println("**NOTE : English is composed of BASIC_LATIN**\n");
            // System.exit(0);
        }
        else if(map.size()==2){
            map.keySet().remove("BASIC_LATIN");
            System.out.println("\nWARNING : Text file is not in English."+ "\nlanguage used in your text is : "+ map.keySet());
        }

    }

    private static HashMap sortByValues(Map<String, Integer> lang) {
        List list = new LinkedList(lang.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
             public int compare(Object o1, Object o2) {
                return -1*((Comparable) ((Map.Entry) (o1)).getValue())
                   .compareTo(((Map.Entry) (o2)).getValue());
             }
        });
 
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
               Map.Entry entry = (Map.Entry) it.next();
               sortedHashMap.put(entry.getKey(), entry.getValue());
        } 
        return sortedHashMap;
   }
}
