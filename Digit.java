import java.util.Scanner.*;
class Digit
{
public static void main(String []x)
{
 int x,i.count=0;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
x=in.nextInt();
while(i>0)
{
 i=x%10;
 if(i>=1)
 count++;
 i=i/10;
 }
 System.out.println("the number of digits are " +count);
 }
 }
