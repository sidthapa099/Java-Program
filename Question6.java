
public class Q6{
public static void main(String[] args){
StringBuffer sb=new StringBuffer("123xyz");
sb.reverse();
String sr="123xyz";
char[] ch=sr.toCharArray();
int c=0;
for(int i=0;i<sr.length();i++)
{

if(Character.isDigit(ch[i]))
{
c=ch[i]+c;
}
}
System.out.println("After reverse the String::"+sb);
System.out.println("Sum of number in a String::"+c);
}
}