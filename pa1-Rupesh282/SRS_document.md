# Requirements Specification # 
<b>for</b>
## ASSIGNMENT 1 ##
<b>prepared by:</b>
## 
* Manjeet Kapil (180010021)
* Harsh Raj (180010017)
* Shriram Ghadge (180010015)
* Rupesh Kalantre (180010029)
##

<b> Date: <b>

### Table of Contents ###
- [Introduction](#Introduction)
  - [Purpose](#Purpose)
  - [Scope](#Scope)
- [User Requirements](#user-requirements)
  - [Software Interfaces](#software-interfaces)
  - [User Interfaces](#user-interfaces)
  - [User Characteristics](#user-characteristics)
- [System Requirements](#system-requirements)
  - [Functional Requirements](#functional-requirements)
  - [Non-Functional Requirements](#non-functional-requirements)


### Introduction ###
#### Purpose ####
  The product (or say tool) to be developed is meant for the students of the nearby university. The instructor wants to help the students in the essays they write by improving their writing style.
#### Scope ####
  The product would be identified by `Command Line Java based tool`. The students would use this tool to cross check the essays they write. This would make them aware of the long sentences and improve their writing style.

### User Requirements ###
#### Software Interfaces ####
  The tool would be a tool written in Java, similar to `ping` utility, that comes pre-installed in Ubuntu operating system, and can be accessed via terminal. It would use the java libraries (and JDK will be a software requirement) and the user would be expected to have java installed on their system (the details to install would be provided in the documentation). We would also need a terminal (or its alternative) to talk with the operating system. <br>
  OS, Java SDK (JDK and JRE), Command Prompt, File System,  <br>
  Constraints: requires libraries that read files containing textual data <br>
#### User Interfaces #### 
  The product will be used via command line. Students will have to run the tool via command line, providing the path to text file that contains their essays, as a command line argument. The script will evaluate the essay and print the required messages/ errors on the screen. So, say for example, if the user provides faulty path (i.e. no text file exists), some error message will be displayed, stating there doesn't exists any such file. Similar messages will be displayed in case the writing standards dont match the expected standards. <br>
  User will provide file path as input <br>
  User will provide various arguments as input (optional) <br>
   &nbsp;delimiter <br>
   &nbsp;default word length <br>
  User should see the output on the console <br>

#### User Characteristics ####
  The students of the university will be its users. It will be made such that large audience (ranging from students having no computer knowledge, to proficient ones) can use it.
  
 ### System Requirements ###
 #### Functional Requirements ####
  * Description and Priority:          
    It would help students improve their essay writing by keeping track of the length of sentences they write. The tool would take path to their essay text file as a command line argument, and output the required messages that could improve their writing. This would be the highest proirity of the tool. 
  * Stimulus and Response Sequences:              
    The user would check the essays by providing the path to the text files containing essays, as command line argument to the tool. The tool would then try to read the text file (if exists) and evaluate the sentences lenght. If the file doesn't exists, the tool will terminate printing message on screen about non availability of file, else the tool will print the details of evaluation of the essay.
  * Feature Requirements:         
    If the user inputs wrong file path (ie. no text file exists at the provided path), the tool would exit, printing message on user screen about non-availability of such file. 
 
| Req#  				| Requirement		| Comment						| Priority |
| --------------------- |:---------------------:|:-----------------------------:|:-----:| 
| REQ1 | To be able to adjust number of words instructor allows as an acceptable sentence. | NA | high |
| REQ2 | To be able to adjust instructors preferences as what symbol should be considered as end of sentences. | From a given set of options, instructor selects as what is favourable. | high |
| REQ3 | Output the appropriate messages (error message in case of faults) | User will understand what went wrong | high |

#### Non-Functional Requirements ####
  User should not edit/ alter the code base of command line tool. Changing the code, without understanding might have hazardous consequences when run, ranging from displaying faulty messages to completely erasing files from the machine.
