package Course;

public class Course {
    private String courseName;
    private String instructor;
    private int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Instructor: " + instructor + ", Credits: " + credits);
    }
}

class OnlineCourse extends Course {
    private String platform;
    private int duration; 

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform + ", Duration: " + duration + " hours");
    }

    public boolean isEligibleForCertificate() {
        return duration >= 20; 
    }
}
