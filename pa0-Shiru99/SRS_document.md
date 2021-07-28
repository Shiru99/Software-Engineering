# Requirements Specification # 
<b>for</b>
## Essay Analyst ##
<b>prepared by:</b>
## 
* Shriram Ghadge
##

<b> Date: 16th sept 2020 <b>

### Table of Contents ###
- [Requirements Specification #](#requirements-specification-)
  - [Essay Analyst](#essay-analyst)
  - [](#)
    - [Table of Contents](#table-of-contents)
    - [Introduction](#introduction)
      - [Purpose](#purpose)
      - [Scope](#scope)
    - [User Requirements](#user-requirements)
      - [Software Interfaces](#software-interfaces)
      - [User Interfaces](#user-interfaces)
      - [User Characteristics](#user-characteristics)
    - [System Requirements](#system-requirements)
      - [Functional Requirements](#functional-requirements)
      - [Non-Functional Requirements](#non-functional-requirements)
  
### Introduction ###
#### Purpose ####
  This Application is for finding out different statistics from an essay for University or school students so that they can get better idea about their own writing style And can improve it.
  But anyone wishing to have statistical data of some text can use this.

#### Scope ####
  As name "Essay Analyst" suggests, this will process the essays of students and gives details of it, like number of words & lines in essay, average length of Sentence, etc. This will let them to improve the essay writing skills

### User Requirements ###
#### Software Interfaces ####
  The Essay Analyst is developed completely in Java. And The application is supposed to execute completely through Command line (for Windows) or Terminal (for linux or Mac). One can get all related commands with "$ Essay Analyst --help". Complete installation procedure is in documentation. 
  
  As Applications is built completely on Java User need have JDK (java development kit) configured on their system to run this application. Every required libraries will be with installation package.
 
   |  Requirement		| Comment						| Priority |
   |---------------------:|:-----------------------------:|:-----:| 
   | JDK To execute the application | installation is in documentation | High 

#### User Interfaces ####
  The Application is  user-friendly. User need to execute complete program from Command line (for Windows) or Terminal (for linux or Mac). With command "$ Essay Analyst --help", user will get all application related commands. The command will need path of essay in text format. The ouput of this command will be on same terminal/command line.

    Command format :
      $ Essay Analyst [path of the essay]   

#### User Characteristics ####
  In general this tool is designed for students of university or school but anyone can use this. Application is built such a way that user don't need to have any knowlege about java or any programming language. Complete user guidence is in documentation (provided).
  
### System Requirements ###

#### Functional Requirements ####

  * Description and Priority	
  
    Application takes path of essay - text file. And as of main aim to provides related statistics, this is only and high priority feature.

  * Stimulus and Response Sequences
  
      Here, flow will be like -
      1. Open Command line (for Windows) or Terminal (for linux or Mac)
      2. provide the path of essay-text file with command : $ Essay Analyst 
      3. With the execution of programme, all details of essays (statistical data) will be provided on same terminal/command line interface
      4. In case of errors in command, specially in path of essay-text file, exact error will be presented on same interface. and let user try same again.

  * Feature Requirements
  
 
    | Req#  				| Requirement		| Comment						| Priority |
    | --------------------- |:---------------------:|:-----------------------------:|:-----:| 
    | Average count of words per sentence | delimiters (;,.!?)  | length of word must be >3 | High 
    | count of sentence | delimiters (;,.!?) | little bit flexible | medium 
    | each word count  | delimiter (space) | - | Low 
    | each character count  | basic characters | no empty or special chars | Low 
    | Average length of words  | delimiter (space)  | - | Low 

 
#### Non-Functional Requirements ####
  Users are supposed to not interfere any packages related to application. Deletion or interference in any file or package may crash the application permanently which would leave only option of reinstallation of Application
