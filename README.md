# FileParser
A java text file parsing class to easily implement into any java project.
It was created during a class assignment and has been added to GitHub so beginner java programmers don't have to worry about basic file IO

# Usage
FileParser only contains static methods therefore it is easily used by calling FileParser.MethodName once FileParser.java is added to the directory of your project.

See Example.java for more information

# Methods
String readFromFile (FileName) 

  readFromFile takes the FileName as a String and returns a String with the contents of the file specified
  
void appendFile (FileName, New Data)

  appendFile will add the new data to the file specified both inputs are expected to be Strings
  
void writeFile (FileName, New Data)

  writeFile will replace the contents of FileName with New Data.  writeFile can also be used to create a new .txt file with the name of FileName
  
void clearTextFile (FileName)

  clearTextFile will delete the contents of FileName

