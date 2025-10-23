package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        
        school.addStudent("Apat");
        school.addStudent("Ian");
        school.addTeacher("Maam : Pedrosa");
        school.addTeacher("Sir : Jonah");
        
        school.createClass("Math 101");
        school.createClass("Science 201");
        
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
        
        school.removeStudent("Alice");
        school.removeTeacher("Mr. Smith");
        
        System.out.println("After removal - Students: " + school.getStudents());
        System.out.println("After removal - Teachers: " + school.getTeachers());
    }
}

