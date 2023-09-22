import java.lang.*;
import java.util.*;
public class Question8
{
public static void main(String args[])
{
String str1, str2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First String");
str1 = sc.nextLine();
System.out.println("Enter the Second String");
str2 = sc.nextLine();
char[] ch1 = str1.toCharArray();
char[] ch2 = str2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(String.valueOf(ch1).equals(String.valueOf(ch2)))
{
System.out.println("the string is anagranm");
}
else{
System.out.println("not anagram");
}
}
}