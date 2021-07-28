## Assignment 2 : PA1
<br>

#### Preamble:
|Name | Roll|
|-----|-----|
|Harsh Raj | 180010017 |
|Manjeet Kapil| 180010021 |
|Rupesh Kalantre | 180010029 |
|Shriram Ghadge | 180010015 |
<br>

#### Name: <br>
A java based command line tool to find the average length of words per sentence present in the given file.
<br>

#### Synopsis: <br>
` java -jar <PATH TO JAR FILE> <PATH TO YOUR ESSAY FILE> --d <DELIMITER> --l <MINIMUM WORD LENGTH> ` <br>
` java -jar <PATH TO JAR FILE> --help ` <br>
` java -jar <PATH TO JAR FILE> --team ` <br>

To run test cases: `python3 tester.py`


#### Description: <br>
This is A java based command line tool to find the average length of words per sentence present in the given file. It help students to analyse the average lenght of the sentences they write in essays, and thus improve their writing. It takes relative path of text file which contains the essay, and calculates the statistics like num of words, num of sentences, average num of words per sentence etc. It has been made user friendly, keeping in mind the diverse background of students that would be using it. It has been made flexible by accepting optional arguments like delemiter which denotes the end of sentence, min num of chars that should be considered as a word etc.

#### Options: <br>
| Arg | Description | Optional | Default |
|-----|-------------|----------|---------|
|path to jar file | this denote the relative path jar files, which contains the bundled code to be executed | No | NA |
|path to essay file | this denotes the relative path to essay file, whose contents is to be evaluated | No | NA |
|delimiter | this denotes the delimiter which will be considered as end of an sentence | Yes | '.' |
|minimum word length | Only those words will be counted which have specified minimum word length | Yes | 4 |
|--help | this prints help/ manpage for executing the program | Yes | NA |
|--team | this prints the team details | Yes | NA |


