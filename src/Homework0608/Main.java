package Homework0608;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(10);

        persons.add(new Teacher("Teacher", "Teacherowsky", 48, 3000, "Dr.", "Web development in Node.js"));
        persons.add(new Student("Student", "Studentowsky", 23, 2, 3, "Web development"));
        persons.add(new Teacher("Teacher", "Teacherowsky2", 42, 4500, "Prof.", "Java"));
        persons.add(new Student("Student", "Studentowsky2", 22, 1, 4, "Java"));
        persons.add(new Teacher("Teacher", "Teacherowsky3", 56, 6000, "Prof.", "C++"));
        persons.add(new Student("Student", "Studentowsky3", 37, 2, 3, "Web development"));
        persons.add(new Student("Student", "Studentowsky4", 28, 2, 3, "Web development"));
        persons.add(new Student("Student", "Studentowsky5", 19, 2, 3, "Web development"));
        persons.add(new Student("Student", "Studentowsky6", 30, 2, 3, "Web development"));
        persons.add(new Student("Student", "Studentowsky7", 26, 2, 3, "Web development"));

        persons.forEach(person -> {
            person.personIntroduction();
            person.universityGoal();
            person.holidayGoal();
        });
    }
}
