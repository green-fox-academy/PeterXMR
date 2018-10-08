import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name; // the name of the cohort
    List students; //a list of student s
    List mentors; // a list of Mentor s
    List persons; // a list of People s

    public Cohort (String name) {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
        persons = new ArrayList<>();
    }

    //creating methods
    public void addStudents (Student student) {
        students.add(student);
    }
    public void addMentors (Mentor mentor) {
        mentors.add(mentor);
    }

    public void  addPersons (Person person) {
        persons.add(person);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
