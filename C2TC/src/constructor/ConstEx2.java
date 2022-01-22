package constructor;


class Student
{
  int id ;
  String name;
  String course;
  String email;
  Student()
  {
      }
  public Student(int id,String name,String course, String email)
  {
    this.id=id;
    this.name=name;
    this.course=course;
    this.email=email;
  }
  public void display()
  {
    System.out.println("Student information");
    System.out.println(id+" "+name+" "+course+" "+email);
  }
}
public class ConstEx2 {

	public static void main(String[] args) {
  Student s1=new Student();
  s1.id=18333;
  s1.name="NEHA";
  s1.course="JAVA";
  s1.email="ahydbko";
  s1.display();
  
  Student s2=new Student(18331,"SHIVANI","JAVA","shitvj");
  s2.display();
  Student s3=new Student(18320,"Ruk","Python","shwobc");
  s3.display();
}


}


