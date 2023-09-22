import java.util.*;
public class Question3
{
public static void main(String args[])
{
String str, v;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the required String");
str = sc.nextLine();
v = str.replaceAll("[AEIOUaeiou]","");
System.out.println("Output String\n" +v);
}
}