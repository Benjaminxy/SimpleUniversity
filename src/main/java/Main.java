import model.Course;
import model.Student;
import model.Teacher;
import service.Clerk;
import service.CourseService;
import service.StudentService;
import service.TeacherService;

public class Main {

        public static void main(String[] args) {
            StudentService studentService = new StudentService();
            Clerk clerk = new Clerk();
            String password = "aA1!slkdjf";
            Student student
                    = new Student("Farzad", "afshar", "3080000000", password);
            System.out.println(studentService.register(student));
            System.out.println(clerk.acceptStudent("3080000000"));
            System.out.println(clerk.updateStudent("3080000000" , "jadid"));


            TeacherService teacherService = new TeacherService();
            System.out.println(teacherService.register(new Teacher("tkjfdlskfj", "dklfjdlkfj", "3080200000", "aA1!dslkjfd")));

            System.out.println(clerk.acceptTeachert("3080200000"));
            System.out.println(clerk.updateTeacher("3080200000" , "jadid"));


            Course course = new Course("programming", 12345, 30);
            Course course1 = new Course("programming1", 12346, 30);
            CourseService courseService = new CourseService();
            System.out.println("addCourse "+ courseService.addCourse(course));

        }
}
