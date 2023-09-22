import java.util.Scanner;
public class Question9
{
public static void main(String args[])
{
String a,b="",c="";
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the words");
a=sc.nextLine();
for(i=0; i<a.length(); i++)
{
if(a.charAt(i)!=' ')
{
b=b+a.charAt(i);
}
else
{
if(b.length()>c.length())
{
c=b;
}
b="";
}
}
System.out.println("the longest word is= "+c);
}
}
