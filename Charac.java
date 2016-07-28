import java.util.Scanner;
class Charac
{
public static void main(String []x)
{
 char c;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
c=in.nextChar();
if((c>=65&&<=90)||(c>=97&&<=122))
System.out.println("it is a character");
else
System.out.println("not a character");
}
} 
  