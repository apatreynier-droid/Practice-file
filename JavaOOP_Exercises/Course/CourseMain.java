package Course;


public class CourseMain {
    public static void main(String[] args) {
        Course c = new Course("Math 101", "Dr. Ian", 3);
        c.displayCourseDetails();
        
        OnlineCourse oc = new OnlineCourse("Java Programming", "Prof. Enot", 4, "Coursera", 25);
        oc.displayCourseDetails();
        System.out.println("Eligible for Certificate: " + oc.isEligibleForCertificate());
    }
}
