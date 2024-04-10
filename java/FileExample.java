import java.io.*;  
import java.util.*;  
// create FileExample class to copy data of one file into another  
public class FileExample {  
    // create coptData() method that copy data of file1 into file2  
    public static void copyData() throws Exception  
    {  
        // create instances of FileInputStream and FileOutputStream classes for file1 and file2  
        FileInputStream inputStream = new FileInputStream("c:\\abel\\java\\FileDemo.java");  
        FileOutputStream outputStream = new FileOutputStream("c:\\abel\\java\\copyFileDemo.java");  

        // use try-catch-finally block to read and write bytes data into file  
        try {  
            // declare variable for indexing  
            int i;  
            // use while loop with read() method of FileInputStream class to read bytes data from file1  
            while ((i = inputStream.read()) != -1) {  
                  
                // use write() method of FileOutputStream class to write the byte data into file2  
                outputStream.write(i);  
            }  
        }
  catch(Exception e) {  
            System.out.println("Error Found: "+e.getMessage());  
        }  
        // use finally to close instance of the FileInputStream and FileOutputStream classes  
        finally {  
        
                inputStream.close();  
		outputStream.close();  
            }  
System.out.println("File Copied");   
} 
public static void main(String[] args) throws Exception
{
 copyData();  

}
}