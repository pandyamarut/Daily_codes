import java.io.*;
class student
{
public int Name(int a, int b)
{ 
return (a+b);
}
public void USN()
{
System.out.println("Usn:66");
}
public void College()
{
System.out.println("DSCE");
}
public static void main(String args[])
{
student s = new student();
s.Name(10,20);
s.USN();
s.College();
System.out.println("Name class not working please do check");
}
}
