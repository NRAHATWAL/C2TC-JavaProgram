package constructor;

public class StudentIdNotFound extends Exception {
	int sid;
	StudentIdNotFound()
	{
		
	}
public StudentIdNotFound(int sid)
{
	this.sid=sid;
}
public String toString()
{
	return "Exception :: Student id not found !!";
}
public String getMessage()
{
	return "Student with id"+sid+"Not Found!!";
}
}
