import java.util.*;
public class Question2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the required string: ");
String str = sc.nextLine();
int v = 0;
int c = 0;
int s = 0;
str = str.toLowerCase();
for (int i = 0; i < str.length(); i++)
{
char ch = str.charAt(i);
if (ch >= 'a' && ch <= 'z') {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
v++;
} else {
c++;
}
} else if (ch == ' ') {
s++;
}
}
System.out.println("Vowels: " + v);
System.out.println("Consonants: " + c);
System.out.println("Spaces: " + s);
sc.close();
}
}