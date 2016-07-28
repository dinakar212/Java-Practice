import java.util.Scanner;
class Leap
{
public static void main(String []x)
{
 int y;
System.out.println("ENTER THE YEAR");
Scanner in = new Scanner(System.in);
y=in.nextInt();
if(y%4==0)
System.out.println("LEAP YEAR");
elseif(y%400==0)
System.out.println("LEAP YEAR");
else
System.out.println("NOT A LEAP YEAR");
}
}
