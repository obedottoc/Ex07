package fileinfo;

import java.io.File;
import java.nio.file.Files;
import java.io.File;
import java.util.*;

public class FileInformation
	{
	
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
				if(f.canRead()==true);
				{
					System.out.println("Readable : YES");
			
				}
			
				if(f.canWrite()==true);
					{
						System.out.println(" writable : YES");
					}
						
					System.out.println("the file size is :"+f.length()+" bytes");
					public String Filetype(final String fileName)
					{
						String fileType="undetermined";
						final File file=new File(fileName);
						try
						{
							fileType=Files.probeContentType(file.toPath());
						}
						catch(Exception ioException)
						{
							System.out.println("ERROR:UNABLE TO DETECT FILE"+ioException);
							
						}
						return fileType;
					}
					
			}
		else
			{
				System.out.println("The file does not exist.");
			}
		}

	public static void main(String[] args)
		{
		FileInformation fi;
		
			fi=new FileInformation();
			fi.CheckFile();

	}

}