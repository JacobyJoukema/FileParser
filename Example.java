/*
 * Here is an example of how FileParser.java may be used in a program.
 */
public class Example
{
	public static void main(String[] args) 
	{
		String fileData;
		fileData = FileParser.readFromFile("myFile.txt");//Gets the data from myFile.txt and stores it in fileData
		System.out.println(fileData);//outputs fileData
		FileParser.appendFile("myFile.txt", "Hello, again!");//Adds the String "Hello again!" to myFile.txt 
		FileParser.writeFile("newFile.txt", "I'm Making A New File Now!");//Creates a new text file named newFile.txt and adds the String specified
	}

}
