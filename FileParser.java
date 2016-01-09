/*
 * Names: Jacoby Joukema, Mikhail Andrenkov, & Chamu Rajasekera
 * Description: This is a pre-prepared class that handles all basic file IO 
 * through BufferedReader, BufferedWriter, PrintWriter and FileWriter
 * Use: See README.md
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class FileParser
{
	public static String readFromFile(String fileName)
	{
		String docData = "";
		try {
			BufferedReader br = new BufferedReader (new FileReader(fileName));
			boolean first = true;
			String line = br.readLine();
			while (line != null)
			{
				if (first==true)
				{
					docData = docData+ line;
					first = false;
				}
				else
				{
				docData = docData+"\n" + line;
				}
				line = br.readLine();
			}
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("IO Exception, Check File Name");
			return null;
		}
		return docData;
		
	}
	public static void appendFile (String fileName, String data)//append file method
	{
		try
		{
			PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));//init writer
			w.write(data+"\n");
			w.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println(fileName + " Does not exist");//output error
		}
	}

	public static void writeFile (String fileName, String data)//write over a file
	{
		try
		{
			PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(fileName, false)));//init writer
			w.write(data);
			w.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println(fileName + " Might not exist");//output error
		}
	}
	public static void clearTextFile (String fileName)
	{
		writeFile(fileName,"");
	}
}
