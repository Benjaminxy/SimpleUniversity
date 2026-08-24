import model.Course;
import model.Student;
import model.StudentCourse;
import model.Teacher;
import repository.StudentCourseRepository;
import service.*;

public class Main {

        public static void main(String[] args) {
            StudentService studentService = new StudentService();
            AdminService adminService = new AdminService();
            String password = "aA1!slkdjf";
            Student student
                    = new Student("Benjamin", "kasz", "3080000000", password);
            Student student2
                    = new Student("benj", "roz", "3080000001", password);
            System.out.println("register student1 ->  " + studentService.register(student));
            System.out.println("register student2 ->  " + studentService.register(student2));
            System.out.println("accept student ->  " + adminService.acceptStudent("3080000000"));
            System.out.println("update student firstname ->  " + adminService.updateStudent("3080000000" , "ajab"));


            TeacherService teacherService = new TeacherService();
            System.out.println("register teacher ->  " + teacherService.register(new Teacher("farzad", "afshar", "3080200000", "aA1!dslkjfd")));

            System.out.println("accept teacher ->  " +adminService.acceptTeacher("3080200000"));
            System.out.println("update teacher firstname ->  "+adminService.updateTeacher("3080200000" , "jadid"));


            Course course = new Course("programming", 12345, 30);
            Course course1 = new Course("programming2", 12346, 30);
            CourseService courseService = new CourseService();
            System.out.println("addCourse ->   "+ courseService.addCourse(course));
            System.out.println("addCourse douplicate  ->  "+ courseService.addCourse(course1));

            System.out.println("all students:");
            Student [] studentList = adminService.getAllStudents();
            for (int i = 0; i < studentList.length; i++) {
                System.out.println("student " + i + " ->  " + studentList[i]);

            }

            System.out.println("all teachers:");
            Teacher [] teacherList = adminService.getAllTeachers();

            for (Teacher teacher : teacherList)
            {
                System.out.println(teacher);
            }


            StudentCourseService studentCourseService = new StudentCourseService();

            System.out.println("register course:");
            StudentCourse studentCourse1 = new StudentCourse("3080000000", 12345);
            System.out.println("register course1 ->  " + studentCourseService.addStudentCourse(studentCourse1));
            System.out.println("register course2 ->  " + studentCourseService.addStudentCourse(new StudentCourse("3080000000", 12346)));


            System.out.println("courses registered by student 3080000000:");
            String[] registeredCourseNames = studentService.getRegisteredCourseNames("3080000000");
            for (int i = 0; i < registeredCourseNames.length; i++) {
                System.out.println(registeredCourseNames[i]);
            }

            System.out.println(studentCourseService.setGrade("3080000000", 12345, 20));


        }
}
