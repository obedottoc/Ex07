/*created by akhshy ganesh
 * gmail id: akhshyganeshb@gmail.com
 * program for reading a file name from the user, displays information about whether
the file exists, whether the file is readable, or writable, the type of file and the length of the file in
bytes.
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
			if(f.canRead()==true)
			{ System.out.println("The file is readable");
			}
			else {
				System.out.println("The file is not readable");
			}
			if(f.canWrite()==true)
			{ System.out.println("The File is Writable ");
			}
			else {
				System.out.println("The file is not writable");
			}
				System.out.println("The length is"+f.length());
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
