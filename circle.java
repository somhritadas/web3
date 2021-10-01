import java.util.*;
class Circle
{
double r;
double AREACIRCLE;
void areac()
{
areac = 3.14*r*r; 
}
void display()
{
System.out.println("Area of circle is : "+areac);
}
}
class Square
{
double l;
double b;
double areas;
void areas()
{
areas = l*b; 
}
void display()
{
System.out.println("Area of Square is: "+areas);
}
}
class Test
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
double l1,b1,r1;
System.out.println("Enter Length and breadth");
l1=in.nextDouble();
b1=in.nextDouble();
Square obj = new Square();
obj.l=l1;
obj.b=b1;
obj.areas();
obj.display();
System.out.println("Enter radius");
r1=in.nextDouble();
Circle obj1 = new Circle();
obj1.r=r1;
obj1.areac();
obj1.display();
}
}
