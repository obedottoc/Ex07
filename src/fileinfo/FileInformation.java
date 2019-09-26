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
if(f.canRead())

{
System.out.println("The file can able to read");
}
else {
System.out.println("The file cannot be able to read");
}
if(f.canWrite())
{
System.out.println("The file can able to write");
}else
{
System.out.println("The file cannot be able to write");
}
System.out.println("The length of file is:"+f.length());
System.out.println("The type of file is:"+getFileExtension(f));
}

private String getFileExtension(File f) {
// TODO Auto-generated method stub
String fileName = f.getName();
       if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
       return fileName.substring(fileName.lastIndexOf(".")+1);
       else return "";

}

public static void main(String[] args) {
FileInformation fi;

fi=new FileInformation();
fi.CheckFile();
           
}

}
