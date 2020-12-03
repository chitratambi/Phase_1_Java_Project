package chitra.core.project;

import java.io.*;
import java.util.*;

public class LockedMe_Menu 
{
	public static void main(String[] args)
	   {
		// Create a Scanner object for keyboard input.
	       Scanner console_input = new Scanner(System.in);

	    // Print menu
	       for (int i = 1; i <= 4; i++)
	            System.out.println(i + ". Menu item #" + i);
	        	System.out.println("0. Quit");

	    // handle user commands
	       boolean quit = false;
	       
	     // to hold the value
	        int menuItem;

	        do {
	            System.out.print("\nChoose Menu Item-\t");
	            menuItem = console_input.nextInt();

	     // Determine the corresponding option
	        switch (menuItem)
	        {
	        	case 1 :
	        		LockedMe_Menu createFile = new LockedMe_Menu (); // Create an object 
	        		createFile.Create_File(); // Call the public method
	        		break;
	      
	        	case 2 :
	        		LockedMe_Menu showFile = new LockedMe_Menu (); // Create an object 
	        		showFile.Show_File(); // Call the public method
	        		break;

	        	case 3 :
	        		LockedMe_Menu deleteFile = new LockedMe_Menu (); // Create an object 
	        		deleteFile.Delete_File(); // Call the public method
	        		break;
	        		
	        	case 4 :
	        		LockedMe_Menu searchFile = new LockedMe_Menu (); // Create an object 
	        		searchFile.Search_File(); // Call the public method
	        		break;
	        		
	        	case 0:

                    quit = true;

                    break;
	      default :
	         System.out.println("Invalid choice.");
	      }  
	   }
	        while (!quit);

	        System.out.println("Bye-bye! Application Terminated...");
	   }

	// This code is used to Create the File.
	public void Create_File() 
	{
		System.out.println("\nFile Creation: ");
		System.out.println("--------------------------------");
		try 
			{
				Scanner c_fname = new Scanner(System.in); 
				System.out.print("Please Enter the desired name of your file-\t");
				String fileName = c_fname.nextLine();
				fileName = fileName + ".txt";
				File file=new File(fileName);

				if(file.createNewFile())
				{
					System.out.println("File " + file.getName() + " created.");
				}
				else
				{
					System.out.println("file already exist");
					System.out.println("File path "+ file.getAbsolutePath());
							     
				}
			}
		catch (IOException e) 
			{
				System.out.println("An error occurred.");
				e.printStackTrace();
			} 
	}

	// This code is used to Show the File list the File.
	public void Show_File() 
	{	
		System.out.println("\nFile List: ");
		System.out.println("--------------------------------");
		try {

		      File folder = new File("C:\\Users\\user\\eclipse-workspace\\Phase_1_Java");

		      // list all the files
		      File[] files = folder.listFiles();
		      for(File file : files) {
		        if(file.isFile()) {
		          System.out.println(file);
		        }
		      }
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
	}
	
	// This code is used to Delete the File.
	public void Delete_File() 
	{	
		System.out.println("\nFile Deletion: ");
		System.out.println("--------------------------------");
		
		String Filename;
		Scanner d_fname = new Scanner(System.in); 
		System.out.println("Please Enter the file name to delete-\t");
		Filename = d_fname.next();
		
		File file = new File(Filename); 
	    boolean b = file.delete();
		if(b==true) 
	    { 
	        System.out.println("File deleted successfully"); 
	    } 
	    else
	    { 
	        System.out.println("Failed to delete the file"); 
	    } 
	}
	
	// This code is used to Search the File in Specified Directory.
	public void Search_File() 
	{
		System.out.println("\nFile Search: ");
		System.out.println("--------------------------------");
		String path = "", fileName = "";
	    try 
	    	{
	        	System.out.print("Please Enter the path-\t");
	        	BufferedReader filePathReader = new BufferedReader(new InputStreamReader(System.in));
	        	path = filePathReader.readLine();
	        	
	        	System.out.print("Please Enter file name-\t");
	        	BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
	        	fileName = fileNameReader.readLine();

	        	File directory = new File(path);
	        	File[] listOfFiles = directory.listFiles();
	        	for (File file : listOfFiles) 
	        		{
	                	String name = file.getName();
	                	if (name.equals(fileName)) 
	                		{
	                        	System.out.println(name + " found in " + path + " directory");                	
	                        	return;
	                		}
	        		}
	        	System.out.println(fileName + " not found in " + path + " directory");
	    	} 
	    catch (IOException e) 
	    	{e.printStackTrace();}	
	}	
}
