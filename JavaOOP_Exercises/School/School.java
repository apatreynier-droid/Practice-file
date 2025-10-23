package School;


import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    
    public List<String> getStudents() {
        return students;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public List<String> getClasses() {
        return classes;
    }

    
    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    
    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
    }

    
    public void createClass(String className) {
        classes.add(className);
    }
}

