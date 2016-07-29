import java.util.Scanner.*;
class Odd
{
public static void main(String []x)
{
 int a,b;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
while(a<b)
{
 i=a+1;
 if(i%2!=0)
 System.out.println(i);
 a++;
 }
 }
 }
