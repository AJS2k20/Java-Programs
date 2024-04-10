import java.util.Scanner;
import java.io.*;  
class FileDemo {  
    public static void main(String[] args) {  


    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter file name");
    String fileName = myObj.nextLine();   

        try {  
            File file = new File(fileName);  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
      
if (file.canRead())
{
 System.out.println("File is readable mode");
}

      
if (file.canWrite())
{
 System.out.println("File is Writable mode");
}
	System.out.println("File length is:"+file.length()); 

int index = fileName.lastIndexOf('.');
if (index > 0) {
  String extension = fileName.substring(index+1);
  System.out.println("File type = "+extension);
}
   
 
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  
 