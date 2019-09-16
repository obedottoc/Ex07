

/***
 * Developed by sandhiya
 * EEE,212217105052
 * Saveetha Engineering College;
 */
package fileinfo;

import java.io.File;
import java.util.Scanner;

public class FileInformation {
	
	public void CheckFile()
	{
		Scanner sc=new Scanner(System.in);
		String filename;
		File f;
		
		System.out.println("Enter the name of a file with full path:");
		filename=sc.next();
		f=new File(filename);
		
		if(f.exists()==true)
		{
			System.out.println("The file exists.");
			if(f.canRead())
			{
				System.out.println("The file is readable");
			}
			else {
				System.out.println("The file is not readable");
			}
			
			if(f.canWrite()) {
				System.out.println("The file is written");
			}else
			{
				System.out.println("The file cannot be written");
			}
			if(f.canExecute())
			{
				System.out.println("The file is Execute");
			}
			else {
				System.out.println("The file is not Execute");
			}
			System.out.println("Length of the file:"+f.length());
		}else
		{
			System.out.println("The file does not exist.");
		}
	}

	public static void main(String[] args) {
		FileInformation fi;
		
			fi=new FileInformation();
			fi.CheckFile();

	}
}
