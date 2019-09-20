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
			if(f.canRead()==true)
			{
				System.out.println("Readable");
				if(f.canWrite()==true)
				{
					System.out.println("Writeable");
				}
				else
				{
					System.out.println("not writeable");
				}
			}
			else
			{
				System.out.println("not readable");
			}
			if(f.canExecute()==true)
			{
				System.out.println("executable type file");
			}
			else
			{
				System.out.println("non-executable");
			}
			System.out.println("length:"+f.length());
		}
		else
		{
			System.out.println("notes is");
		}
	}
	public static void main(String[]args) {
		FileInformation f1;
		f1=new FileInformation();
		f1.CheckFile();

	}
}
		
		
	
				
			

