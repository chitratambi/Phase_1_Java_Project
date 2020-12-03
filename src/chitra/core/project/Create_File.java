package chitra.core.project;

import java.io.*;

public class Create_File {
	public static void main(String[] args) {
		 try {  
	            File file = new File("C:\\Users\\user\\Desktop\\Simplilearn\\java_full_stack_course\\phase_one\\Phase_1_Project//login.txt");  // this line is used to create the file.
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());
	                    System.out.println("File class:  " + file.getClass());
	                    System.out.println("File parent:  " + file.getParent());
	                    System.out.println("File space allocated:  " + file.getUsableSpace());
	                    System.out.println("File length: " + file.length());
	                    
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	               //--------------Delete the file code below-------------//
	               /* boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                }*/
	                //------------end of the above code--------------------//
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } 

	}

}


