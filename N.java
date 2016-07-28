import java.util.Scanner.*;
class N
{
public static void main(String []x)
{
 int n,i,s=0;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
n=in.nextInt();
for(i=n;i>=0;i--)
{
 s=s+i;
 }
 System.out.println("The sum of natural numbers is " +s);
 }
}
