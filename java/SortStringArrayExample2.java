import java.util.Arrays;  
import java.util.*;
public class SortStringArrayExample2  
{  
public static void main(String args[])   
{  

Scanner s = new Scanner(System.in);
int i;
//System.out.println("Enter the number of countries:");
//n = s.nextInt();
String[] countries = new String[5];
System.out.println("Enter Country names");
for (i=0;i<5;i++)
{
  countries[i]=s.nextLine();
}

Arrays.sort(countries);  
//prints the sorted string array in ascending order  
System.out.println(Arrays.toString(countries));  
}  
}

//defining an array of type string  
//String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};  
//sorts string array in alphabetical order or ascending order  

