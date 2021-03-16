import java.util.LinkedList;

public class Curs {

	String subject;
	LinkedList <Profesor> profesori;
	LinkedList<Student> studenti;
	
	void addStudentToCourse(Student student)
	{
		studenti.add(student);
	}
	
	void removeStudentFromCourse(Student student)
	{
		studenti.remove(student);
	}
	
	void addTeacherToCourse(Profesor teacher)
	{
		profesori.add(teacher);
	}
	
	void  removeTeacherFromCourse(Profesor teacher)
	{
		profesori.remove(teacher);
	}
	
	void createNewCourse(LinkedList<Profesor> profesori, LinkedList<Student> studenti)
	{
		Curs newCourse = new Curs();
		// some code
	}
	
	
}
