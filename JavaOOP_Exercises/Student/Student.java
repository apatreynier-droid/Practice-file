package Student;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;
    private List<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}

