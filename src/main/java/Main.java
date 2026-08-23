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
                    = new Student("Benjamin", "kasz", "3080000000", password);
            Student student2
                    = new Student("benj", "roz", "3080000001", password);
            System.out.println(studentService.register(student));
            System.out.println(studentService.register(student2));
            System.out.println(clerk.acceptStudent("3080000000"));
            System.out.println(clerk.updateStudent("3080000000" , "ajab"));


            TeacherService teacherService = new TeacherService();
            System.out.println(teacherService.register(new Teacher("farzad", "afshar", "3080200000", "aA1!dslkjfd")));

            System.out.println("accept teacher ->  " +clerk.acceptTeachert("3080200000"));
            System.out.println("update teacher firstname ->  "+clerk.updateTeacher("3080200000" , "jadid"));


            Course course = new Course("programming", 12345, 30);
            Course course1 = new Course("programming2", 123456, 30);
            CourseService courseService = new CourseService();
            System.out.println("addCourse ->   "+ courseService.addCourse(course));
            System.out.println("addCourse douplicate  ->  "+ courseService.addCourse(course1));

            Student [] list = clerk.getAllStudent();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
                System.out.println(i);

            }

            Teacher [] teacherList = clerk.getAllTeacher();

            for (Teacher tList : teacherList)
            {
                System.out.println(tList);
            }


        }
}
