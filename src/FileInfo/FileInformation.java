/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:7
 *EEE-A
 */
package FileInfo;

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
System.out.println("The file can be read.");

}
else
{
System.out.println("The file cannot be read.");
}
{
if(f.canWrite()==true)
{
System.out.println("The file can be written.");
}
else
{
System.out.println("The file cannot be written.");
}
if(f.canExecute()==true)
{
System.out.println("The file type is executable");
}
else
{
System.out.println("The file type is not executable");
}
{

System.out.println("Length:"+f.length());
}
 }
    }
else
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