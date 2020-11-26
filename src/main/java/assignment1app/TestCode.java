package assignment1app;

import org.joda.time.LocalDate;

import assignment.Course;
import assignment.Module;
import assignment.Student;

public class TestCode {

	public static void main(String[] args) {
		// TODO Write student code and then push
		
		//create students
		Student student1 = new Student("Alan Fitzpatrick", 17 / 01 / 1998, 22, 12345);
		
		//Course arts = new Course("Arts", new LocalDate(2020, 9, 30), new LocalDate(2020, 12, 15));
		Module eng = new Module("Engineering", 12345);
	}

}
