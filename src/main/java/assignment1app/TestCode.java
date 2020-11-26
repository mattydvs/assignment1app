package assignment1app;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import assignment.Course;
import assignment.Module;
import assignment.Student;

public class TestCode {

	public static void main(String[] args) {
		// TODO Write student code and then push
		// create modules
		Module calculus = new Module("Calculus", 12345);
		Module cad = new Module("CAD", 67891);
		Module pysch = new Module("Pyschology", 56567);
		Module geog = new Module("Geography", 87879);

		// create modules
		Course art = new Course("Arts", new LocalDate(2020, 9, 30), new LocalDate(2020, 12, 15));
		Course eng = new Course("Engineering", new LocalDate(2020, 9, 28), new LocalDate(2020, 12, 10));

		// create students
		Student student1 = new Student("Alan Fitzpatrick", 17 / 01 / 1998, 22, 12345);
		Student student2 = new Student("Willy Joe Padden", 17 / 01 / 1980, 40, 11111);

		// add modules to courses
		eng.addModule(cad);
		eng.addModule(calculus);
		art.addModule(pysch);
		art.addModule(geog);

		// add students to courses
		eng.addStudent(student1);
		art.addStudent(student2);

		// create array list of courses and add courses for ease of iteration
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(art);
		courses.add(eng);

		// create array list of students and add students for ease of iteration
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);

		System.out.println("Courses:");
		for (Course course : courses) {
			System.out.println(course.getName() + "\nModules:");
			for (Module module : course.getModules()) {
				System.out.println('\t' + module.getName());

			}

			System.out.println("\nStudents");
			for (Student student : students) {
				System.out.println(student.getName() + "\t Username:\t" + student.getUsername());
			}

		}
	}

}
