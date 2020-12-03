package chitra.core.project;

import java.awt.Desktop;
import java.io.*;

public class Search_File 
{
	public static void main(String[] args) 
	{	
		String path = "", fileName = "";
		try 	
			{
				System.out.print("Please Enter the path-\t");
				BufferedReader filePathReader = new BufferedReader(new InputStreamReader(System.in));
				path = filePathReader.readLine();	
				
				System.out.print("Please Enter file Name-\t");
				BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
				fileName = fileNameReader.readLine();
	
				File directory = new File(path);
				File[] listOfFiles = directory.listFiles();
					for (File file : listOfFiles) 
						{
							String name = file.getName();
								if (name.equals(fileName)) 
									{
										System.out.println(name);
										if(Desktop.isDesktopSupported())
											{
												Desktop.getDesktop().edit(file);
											}
										return;
									}
						}
					System.out.println(fileName + " not found in " + path + " directory");
			}	
			catch (IOException e) 
				{e.printStackTrace();}
	}
}
