public class Student {
	int id;
	String name;
	Student(){
		System.out.println("This is a default constructor");
	}
	Student(int i, String n){
	id = i;
	name = n;
	}
	public static void main(String args[])
	{
	Student x = new Student();
	Sysout("These are the default constructor values");
	Sysout("Student id:"+x.id+"Student name: "+x.name);
	
	Student s = new Student(1,David);
	System.out.println("These are parameterized constructor values:");
	SOP("Stu id:"+s.id+"Stu name:"+s.name);
	
}