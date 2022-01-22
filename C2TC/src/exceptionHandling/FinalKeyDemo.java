package exceptionHandling;


class Car
{
  final int max_speed =120;
  void controlSpeed()
  {
    //max_speed=180;
    /*final variable can't be change will give complie time error */
   System.out.println("Max speed of"+"the car is "+ max_speed);
  }
}
public class FinalKeyDemo {
public static void main (String[]args)
{
  Car obj=new Car();
  obj.controlSpeed();
}
}


