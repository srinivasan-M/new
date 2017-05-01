import java.util.*;
class rev
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int rnum=0;
while(num>0)
{
rnum=num%10;
num=num/10;
System.out.print(+rnum);
}}
}
