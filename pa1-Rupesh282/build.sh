#add any supporting commands to create avglength.jar, the name of the java JAR file.
ant make-jar

#add any supporting commands to print team info when passed the --team command-line argument
#java -jar avglength.jar --team
java -jar jars/avglength.jar --team
#add any supporting commands to print the documentation on console when --help is passed as a command-line argument
#java -jar avglength.jar --help
java -jar jars/avglength.jar --help
