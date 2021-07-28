# Requirements Specification # 
<b>for</b>
## Project Name ##
<b>prepared by:</b>
## 
* Author 1
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
  Describe the purpose of the product, whose software requirements are specified in this document. Specify the intended audience and mention the overall scope of the product if this product is part of a bigger system.
#### Scope ####
  <Identify the product by its name e.g. Video Player. Explain the applications of this product. Be specific while doing so. As part of this, write goals and benefits of this product, relate the product to overall goals, and summarize the features. >

### User Requirements ###
#### Software Interfaces ####
  <Describe the connections between this product and other specific software components (name and version), including databases, operating systems, tools, libraries, and integrated commercial components. Identify the data items or messages coming into the system and going out and describe the purpose of each. Describe the services needed and the nature of communications. Refer to documents that describe detailed application programming interface protocols. Identify data that will be shared across software components. If the data sharing mechanism must be implemented in a specific way (for example, use of a global data area in a multitasking operating system), specify this as an implementation constraint. See section 6.3.1.5.3 of the reference doc. for further reading.>
#### User Interfaces ####
  <Describe the logical characteristics of each interface between the software product and the users. This may include sample screen images, any GUI standards or product family style guides that are to be followed, screen layout constraints, standard buttons and functions (e.g., help) that will appear on every screen, keyboard shortcuts, error message display standards, and so on. Define the software components for which a user interface is needed. Details of the user interface design should be documented in a separate user interface specification. See section 6.3.1.5.1 of the reference doc. for further reading.>
#### User Characteristics ####
  <Identify the various user categories that you anticipate will use this product. Some of these are users, operators, and maintenance personnel. Identify constraints that pose (based on expertise level / role of the user). E.g. user categories may be differentiated based on frequency of use, subset of product functions / features used, technical expertise, security or privilege levels, educational level, or experience. Describe the pertinent characteristics of each user category. Certain requirements may pertain only to certain user categories. Distinguish the most important user categories for this product from those who are less important to satisfy. See section 6.2. 3 of the reference doc. for further reading.>
  
 ### System Requirements ###
 #### Functional Requirements ####
 <Tabulate system features. For each feature, provide the details of:
     * Description and Priority	
	     <Provide a short description of the feature and indicate whether it is of High, Medium, or Low priority. You may optionally include specific priority component ratings, such as benefit, penalty, cost, and risk (each rated on a relative scale from a low of 1 to a high of 9).>
     * Stimulus and Response Sequences
	     <List the sequences of user actions and system responses that stimulate the behavior defined for this feature. These will correspond to the dialog elements associated with use cases.>
     * Feature Requirements
	     <Itemize the detailed functional requirements associated with this feature. These are the software capabilities that must be present in order for the user to carry out the services provided by the feature, or to execute the use case. Include how the product should respond to anticipated error conditions or invalid inputs. Requirements should be concise, complete, unambiguous, verifiable, and necessary. Use “TBD” as a placeholder to indicate when necessary information is not yet available. See section 6.3.1.1 of the reference doc. for further reading.>
	  	 <Each requirement should be uniquely identified with a sequence number or a meaningful tag of some kind.>
        E.g.
 
| Req#  				| Requirement		| Comment						| Priority |
| --------------------- |:---------------------:|:-----------------------------:|:-----:| 
| REQ_1 | detailed requirement of feature1 | some comment | high
| REQ_2 | detailed requirement of feature2 | some comment | low

#### Non-Functional Requirements ####
  <Identify Performance, Safety, Security, Quality, and Other requirements, See section 6.3.1.5.3 of the reference doc. for further reading.>:

  <If there are performance requirements for the product under various circumstances, state them here and explain their rationale, to help the developers understand the intent and make suitable design choices. Specify the timing relationships for real time systems. Make such requirements as specific as possible. You may need to state performance requirements for individual functional requirements or features.>

  <Specify those requirements that are concerned with possible loss, damage, or harm that could result from the use of the product. Define any safeguards or actions that must be taken, as well as actions that must be prevented. Refer to any external policies or regulations that state safety issues that affect the product’s design or use. Define any safety certifications that must be satisfied.>

  <Specify any requirements regarding security or privacy issues surrounding use of the product or protection of the data used or created by the product. Define any user identity authentication requirements. Refer to any external policies or regulations containing security issues that affect the product. Define any security or privacy certifications that must be satisfied.>

  <Specify any additional quality characteristics for the product that will be important to either the customers or the developers. Some to consider are: adaptability, availability, correctness, flexibility, interoperability, maintainability, portability, reliability, reusability, robustness, testability, and usability. Write these to be specific, quantitative, and verifiable when possible. At the least, clarify the relative preferences for various attributes, such as ease of use over ease of learning.>

  <List any operating principles about the product, such as which individuals or roles can perform which functions under specific circumstances. These are not functional requirements in themselves, but they may imply certain functional requirements to enforce the rules.>



