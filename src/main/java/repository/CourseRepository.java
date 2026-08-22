package repository;

import model.Course;

public class CourseRepository {

    public final static Course [] courses = new Course[100];

public void addCourse (Course course ) {

    if (course == null)
    {
         throw new IllegalArgumentException("the coues is null") ;
    }

    for (int i = 0; i < courses.length; i++) {
        if (courses [i] == null)
        {
            courses [i] = course;
            return;
        }

    }



}
}
