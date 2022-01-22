package Interface;

interface i1
{
  void set (int x,int y);
}

interface i2 
{
  void display();
}

class ImpClass implements i1,i2
{
  int p=10;
  int q=20;
  
  public void set (int x,int y)
  {
    p=x;
    q=y;
  }
  void incr()
  {
    p++;
  }
  
  public void display()
  {
    System.out.println(p);
    System.out.println(q);
  }
}

public class InterfaceDemo1 {
public static void main (String[]args)
{
  ImpClass obj =new ImpClass();
  obj.set(100,200);
  obj.display();
  obj.incr();
  obj.display();
}

}
