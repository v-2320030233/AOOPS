import java.util.List;
public interface EnrollmentService
{
    void enroll(Student student, Course course);
    List<Course> getCoursesByStudent(String studentId);
}
