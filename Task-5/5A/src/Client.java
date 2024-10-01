import java.util.List;
public class Client
{
    public static void main(String[] args)
    {
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Computer Science");
        EnrollmentService enrollmentService = new SimpleEnrollmentService();
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student2, course2);
        enrollmentService.enroll(student1, course2);
        List<Course> aliceCourses = enrollmentService.getCoursesByStudent("S001");
        System.out.println("Courses Alice is enrolled in:");
        for (Course course : aliceCourses)
        {
            System.out.println(course.getCourseName());
        }
    }
}
