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
