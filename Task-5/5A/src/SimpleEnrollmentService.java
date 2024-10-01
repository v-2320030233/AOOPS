import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SimpleEnrollmentService implements EnrollmentService
{
    private final Map<String, List<Course>> studentCourses;
    public SimpleEnrollmentService()
    {
        this.studentCourses = new HashMap<>();
    }
    @Override
    public void enroll(Student student, Course course)
    {
        course.enrollStudent(student);
        studentCourses.computeIfAbsent(student.getStudentId(), k -> new ArrayList<>()).add(course);
    }
    @Override
    public List<Course> getCoursesByStudent(String studentId)
    {
        return studentCourses.getOrDefault(studentId, new ArrayList<>());
    }
}
