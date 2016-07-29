import java.util.Scanner.*;
class Prime
{
public static void main(String []x)
{
 int n,a=2;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
n=in.nextInt();
 for ( c = 2 ; c <= n - 1 ; c++ )
   {
      if ( n%c == 0 )
      {
         System.out.println("not prime");
	        break;
      }
   }
   if ( c == n )
      System.out.println("Prime number");
      }
      }
