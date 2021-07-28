Filegiven:
	given.		[property file]
	notgiven.	[single][property notfile]				

Filetype:
		TextFile.					[if file][property textfile]
		NontextFile.				[if file][error]

File:
	empty.		[if textfile][property empty]			
	nonempty.	[if textfile][property goodfile]

FeaturesOfFile:
	Sentences:	
		NoSentence.		[if textfile][if empty][property nosentence]
		OneSentence.	[if textfile][if goodfile][property sentence]
		MultipleSentence.[if textfile][if goodfile][property sentence]
			Words:
				NoWord			[if textfile][if empty][if !sentence]
				Singleword.		[if textfile][if goodfile][if sentence][property word]
				EverywordLen<MinWordLength. [if textfile][if goodfile][if sentence][property word]

Delimeter:
	IsSpecialCharacter.[if textfile][if goodfile][if sentence]
	IsNotSpecialCharacter.[if textfile][if goodfile][if sentence]
	NotSingleCharacter.[if textfile][if goodfile][if sentence]

MinWordLength:
	Is>0.[if textfile][if goodfile][if sentence][if word]
	Is<0.[if textfile][if goodfile][if sentence][if word]