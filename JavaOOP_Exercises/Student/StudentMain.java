package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("John", "A");
        System.out.println("Initial name: " + s.getName());
        System.out.println("Initial grade: " + s.getGrade());
        System.out.println("Initial courses: " + s.getCourses());
        
        s.addCourse("Math");
        s.addCourse("Science");
        System.out.println("After adding courses: " + s.getCourses());
        
        s.setName("John Doe");
        s.setGrade("A+");
        System.out.println("Updated name: " + s.getName());
        System.out.println("Updated grade: " + s.getGrade());
        
        s.removeCourse("Math");
        System.out.println("After removing 'Math': " + s.getCourses());
    }
}
