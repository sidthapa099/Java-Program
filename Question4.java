import java.util.*;
public class Question4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the required string: ");
String str = sc.nextLine();
String output = removeWhitespace(str);
System.out.println("After removal: " +output);
sc.close();
}
public static String removeWhitespace(String str1)
{
return str1.replaceAll("\\s", "");
}
}




