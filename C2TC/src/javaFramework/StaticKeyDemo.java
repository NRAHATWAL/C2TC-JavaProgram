package javaFramework;

public class StaticKeyDemo {

int a=10;
int b;
static int c=25;
void func1()
{
  System.out.println("the value are ");
  System.out.println("a value is"+a);
  System.out.println("b value is"+b);
  System.out.println("c value is"+c);
  
}

static void func2()
{
  int d=19;
  System.out.println("d value is"+d);
  System.out.println("c value is"+c);
  
  
}

static 
{
  System.out.println("Hi am in static block ");
  
  System. exit(0);  // if you want to exit form this program then its use//
}

public static void main (String[]args)
{
  System.out.println("c value is"+StaticKeyDemo.c);
  StaticKeyDemo obj=new StaticKeyDemo();
  obj.func1();
  StaticKeyDemo.func2();
  
}

}

