----------------------------------------------------------------------------


	Testing the program by generating test cases using TSL generator on category parition method

	Team -: Software Fighters


----------------------------------------------------------------------------


To get all the test case by using file pc.spec-:
Run this command and it will produce pc.spec.tsl where all test cases written:
	./TSLgenerator-linux -c pc.spec



We have to test our program using each cases one by one by diffrentiating on these features as we get test cases=>Words-:


1.Filegiven-: It specifies whether file given or not.

2.Filetype-: By differentiating several file types probability of error increases.

3.File-: It specifies whether the file is empty or not.

4.Sentences-: It species some boundary conditions on Sentences.

5.Words-: It species some boundary conditions on Words.

7.Delimeter-:For special character.

8.Minimum Word lenth-: For not counting the words which is below this number.



To test all cases we used 'tester.py' file 

run tester.py file with $ python3 tester.py


Explanation of all corresponing files & commands in tester.py :

1.  Case 1  : Empty file
2.  Case 2  : non-text file
3.  Case 3  : non-English text file (just adds Warning about lang. used other than English AND runs as usual)
4.  Case 4  : multiple langs. in text file (just adds Warning about langs used other than English AND runs as usual)
5.  Case 5  : Normal text file
6.  Case 6  : Normal text file with empty delimiter (incorrect argument)
7.  Case 7  : Normal text file with delimiter 
8.  Case 8  : Normal text file with multicharacter delimiter
9.  Case 9  : Normal text file with empty min. word length (incorrect argument)
10. Case 10 : Normal text file with word length
11. Case 11 : Normal text file with -ve word length
12. Case 12 : Normal text file with non-interger word length
13. Case 13 : Normal text file with empty delimiter & empty word length
14. Case 14 : Normal text file with empty word length & empty delimiter
15. Case 15 : Normal text file with delimiter & word length 
16. Case 16 : Normal text file with Word length & delimiter

------------------OUTPUT-------------------------------------
--------------- CASE 1 ---------------

Empty File !!! 	(please add non-empty file)

--------------- CASE 2 ---------------

Only text format is allowed. Your file-address have extension : 'jpg'

--------------- CASE 3 ---------------

WARNING : Text file is not in English.
language used in your text is : [CJK_UNIFIED_IDEOGRAPHS]

File used  			: TestFiles/Chinese.txt
Delimiter used  		: '.'
Minimum word Length set to be 	:  4

Summary: 
	Number of words in your text                 : 18
	Number of sentences in your text             : 2
	Average length of each sentence in your text : 9


--------------- CASE 4 ---------------

WARNING : Text file is expected to be strictly in English. (Your text uses more than 1 languages) 
languages used in your text are : [BASIC_LATIN, DEVANAGARI, CYRILLIC, CJK_UNIFIED_IDEOGRAPHS, GENERAL_PUNCTUATION]
**NOTE : English is composed of BASIC_LATIN**


File used  			: TestFiles/Multiple.txt
Delimiter used  		: '.'
Minimum word Length set to be 	:  4

Summary: 
	Number of words in your text                 : 249
	Number of sentences in your text             : 26
	Average length of each sentence in your text : 9


--------------- CASE 5 ---------------

File used  			: TestFiles/English.txt
Delimiter used  		: '.'
Minimum word Length set to be 	:  4

Summary: 
	Number of words in your text                 : 70
	Number of sentences in your text             : 8
	Average length of each sentence in your text : 8


--------------- CASE 6 ---------------

Some error in arguments ! (may be missing some arguments)	(For more help, use '--help' tag)

**Note : if file path contains space, Add '\' before space OR Add complete file path in single quotes - '<FILE PATH>'

--------------- CASE 7 ---------------

File used  			: TestFiles/English.txt
Delimiter used  		: 'a'
Minimum word Length set to be 	:  4

Summary: 
	Number of words in your text                 : 70
	Number of sentences in your text             : 49
	Average length of each sentence in your text : 1


--------------- CASE 8 ---------------

Delimiter must be a single character.
Delimiter set by you - 'ab'	(For more help, use '--help' tag)

**Note : if file path contains space, Add '\' before space OR Add complete file path in single quotes - '<FILE PATH>'

--------------- CASE 9 ---------------

Some error in arguments ! (may be missing some arguments)	(For more help, use '--help' tag)

**Note : if file path contains space, Add '\' before space OR Add complete file path in single quotes - '<FILE PATH>'

--------------- CASE 10 ---------------

File used  			: TestFiles/English.txt
Delimiter used  		: '.'
Minimum word Length set to be 	:  3

Summary: 
	Number of words in your text                 : 90
	Number of sentences in your text             : 8
	Average length of each sentence in your text : 11


--------------- CASE 11 ---------------
The minimum word length you provided in the third argument can't be negative !
	(For more help, use '--help' tag)


--------------- CASE 12 ---------------
The minimum word length you provided in the third argument is not an Integer !
	(For more help, use '--help' tag)


--------------- CASE 13 ---------------

Delimiter must be a single character.
Delimiter set by you - '--l'	(For more help, use '--help' tag)

**Note : if file path contains space, Add '\' before space OR Add complete file path in single quotes - '<FILE PATH>'

--------------- CASE 14 ---------------
The minimum word length you provided in the third argument is not an Integer !
	(For more help, use '--help' tag)


--------------- CASE 15 ---------------

File used  			: TestFiles/English.txt
Delimiter used  		: 'a'
Minimum word Length set to be 	:  3

Summary: 
	Number of words in your text                 : 90
	Number of sentences in your text             : 49
	Average length of each sentence in your text : 1


--------------- CASE 16 ---------------

Some error in arguments !	(For more help, use '--help' tag)

**Note : if file path contains space, Add '\' before space OR Add complete file path in single quotes - '<FILE PATH>'



