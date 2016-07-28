import java.util.Scanner;
class Large
{
public static void main(String []x)
{
 int a,b,c;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b)
{
  if(a>c)
System.out.println("the largest of the three is " +a);
 else
System.out.println("the largest of the three is " +c);
}
else
{
 if(b>c)
System.out.println("the largest of the three is " +b);
 else
System.out.println("the largest of the three is " +c);
} 
}
}
  
