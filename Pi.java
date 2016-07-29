import java.util.Scanner.*;
class Pi
{
public static void main(String []x)
{
 int a,b,i,count;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
while(a<b)
{
 count=0;
 for(i=2; i<=a/2; ++i)
        
            if(a%i == 0)
            {
                count=1;
                break;
            }
        }

        if (count == 0)
            System.out.println(a);

        ++a;
}
}
