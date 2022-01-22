package constructor;

class Box
{
  float width;
  float height;
  float depth;
  String color;
  
  float calcvol(){
    return width *height *depth;
  }
}

public class BoxDemo {

	public static void main(String[] args) {
 Box box1=new Box();
 //box1=new Box();
 box1.width=3.4f;
 box1.height=2.2f;
 box1.depth=1.4f;
 float vol=box1.calcvol();
 System.out.println("volume of the Box1 is"+vol);
 Box box2=new Box();
 //box2=new Box();
 box2.width=3.4f;
 box2.height=5.2f;
 box2.depth=3.4f;
 box2.color="Black";
  float vol1=box2.calcvol();
 System.out.println("volume of the Box2 is "+vol1);
 }

}


