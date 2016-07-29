import java.util.Scanner.*;
class Power
{
public static void main(String []x)
{
 int b,e;
System.out.println("ENTER THE base and exponent");
Scanner in = new Scanner(System.in);
b=in.nextInt();
e=in.nextInt();
System.out.println(Math.pow(b,e));
}
}
