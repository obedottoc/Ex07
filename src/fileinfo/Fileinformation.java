/**
 * To create file information application
 * harsha vardhan reddy
 */
package fileinfo;
import java.io.File;
import java.util.Scanner;

public class Fileinformation {
public void checkfile(){
	Scanner sc=new Scanner(System.in);
	String filename;
	File f;
	System.out.println("Enter the file name: ");
	filename=sc.next();
	f=new File(filename);
	if(f.exists()==true);
	{
		System.out.println("Exists");
		if(f.canRead()==true) {
			System.out.println("Readable");
			if(f.canWrite()==true) {
				System.out.println("writeable");
				
			}else
			{System.out.println("not writeable");
			}
		}
		else {
			System.out.println("not readable");
			
		}
		if(f.canExecute()==true) {
			System.out.println("Executable type file");
		}
		else {
			System.out.println("non executable");
		}
		System.out.println("The file does not exist");
	}
	public static void main(String[]args)
		Fileinformation fi;
	fi=new Fileinformation();
	fi.checkfile();
	
	}
}

